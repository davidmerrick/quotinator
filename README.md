AWS Lambda service, written in Kotlin, that returns a JSON payload containing a random quote from a list of quotes. 

Uses the [Serverless](https://serverless.com/) framework for deployment and provisioning resources.

Writing this to get more familiar with developing in Lambda with Kotlin.

Quotes are structured like this: 

```json
{
    "text": "We are not rich by what we possess but by what we can do without.",
    "author": "Immanuel Kant"
}
```

The list of them is in the `com.merricklabs.logic.quotes.json` resource file. 
Eventually I'll move this to S3 so this can be modified without a redeploy.

# Setup:

* Create an AWS profile called `serverless_deploy` and attach administrative access to it.
* Add the credentials for this profile to your `~/.aws/credentials` file.
* Use `./gradlew deploy` to deploy this function and provision the API endpoints.

