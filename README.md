# Email Service Provider

This project aims to provide a microservice for connecting to an AWS account and sending mass emails. It utilizes Amazon Simple Email Service (SES) as the email service provider.

## Project Structure

The project is divided into several packages:

### 1. `adapters`

Contains the `EmailSenderGateway` interface, defining the contract for sending emails.

### 2. `application`

Includes the concrete implementation of the use case in the `EmailSenderService` class, utilizing the `EmailSenderGateway` interface to send emails.

### 3. `controllers`

Contains the `EmailSenderController` controller exposing a REST endpoint for sending emails. It utilizes the `EmailSenderService` class to handle requests.

### 4. `core`

Contains the definition of the `EmailRequest` data object and the `EmailSenderUseCase` interface, defining the use case for sending emails.

### 5. `core.exceptions`

Includes the `EmailServiceException` exception class, used to handle specific email service errors.

### 6. `infra.config`

Contains AWS SES configuration in the `AwsSesConfig` class, providing an instance of `AmazonSimpleEmailService`.

### 7. `infra.ses`

Contains the concrete implementation of the `EmailSenderGateway` interface in the `SesEmailSender` class, using AWS SES to send emails.

### 8. `EmailServiceProviderApplication`

The main class that starts the Spring Boot application.

## AWS SES Configuration

The AWS SES configuration is found in the `AwsSesConfig` class. Make sure to provide the appropriate credentials and configure other properties as needed.

## Service Usage

To send an email, make a POST request to the `/api/email/send` URL with a JSON body containing the `to`, `subject`, and `body` fields. For example:

```json
{
  "to": "recipient@example.com",
  "subject": "Email Subject",
  "body": "Email body content."
}

