AWS Lambda service, written in [Kotlin](https://kotlinlang.org/), that returns a JSON payload containing a random quote from a list of quotes. 

Uses the [Serverless](https://serverless.com/) framework for deployment and provisioning resources.

I wrote this to get more familiar with Kotlin.

# Live demo

https://projects.david-merrick.com/2018/quotinator/

# API

The API simply returns a single quote, structured as follows:

```json
{
    "text": "We are not rich by what we possess but by what we can do without.",
    "author": "Immanuel Kant"
}
```

The list of quotes is stored the `com.merricklabs.logic.quotes.json` resource file. 
Eventually I'll move this to S3 so this can be modified without a redeploy.

# Setup:

* Create an AWS profile called `serverless_deploy` and attach administrative access to it.
* Add the credentials for this profile to your `~/.aws/credentials` file.
* Use `./gradlew deploy` to deploy this function and provision the API endpoints.

