

# ToolMobileGetPublicConfig200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agedigitalconsentverification** | **Boolean** | Whether age digital consent verification                     is enabled. |  [optional] |
|**authinstructions** | **String** | Authentication instructions. |  |
|**authloginviaemail** | **Integer** | Whether log in via email is enabled. |  |
|**authnoneenabled** | **Integer** | Whether auth none is enabled. |  |
|**autolang** | **Integer** | Whether to detect default language                     from browser setting. |  [optional] |
|**compactlogourl** | **String** | The site compact logo URL |  [optional] |
|**country** | **String** | Default site country |  [optional] |
|**enablemobilewebservice** | **Integer** | Whether the Mobile service is enabled. |  |
|**enablewebservices** | **Integer** | Whether Web Services are enabled. |  |
|**forgottenpasswordurl** | **String** | Forgotten password URL. |  |
|**guestlogin** | **Integer** | Whether guest login is enabled. |  |
|**httpswwwroot** | **String** | Site https URL (if httpslogin is enabled). |  |
|**identityproviders** | [**List&lt;ToolMobileGetPublicConfig200ResponseIdentityprovidersInner&gt;**](ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md) |  |  [optional] |
|**lang** | **String** | Default language for the site. |  [optional] |
|**langlist** | **String** | Languages on language menu. |  [optional] |
|**langmenu** | **Integer** | Whether the language menu should be displayed. |  [optional] |
|**launchurl** | **String** | SSO login launch URL. |  [optional] |
|**locale** | **String** | Sitewide locale. |  [optional] |
|**logourl** | **String** | The site logo URL |  [optional] |
|**maintenanceenabled** | **Integer** | Whether site maintenance is enabled. |  |
|**maintenancemessage** | **String** | Maintenance message. |  |
|**mobilecssurl** | **String** | Mobile custom CSS theme |  [optional] |
|**registerauth** | **String** | Authentication method for user registration. |  |
|**rememberusername** | **Integer** | Values: 0 for No, 1 for Yes, 2 for optional. |  |
|**sitename** | **String** | Site name. |  |
|**supportavailability** | **Integer** | Determines who has access to contact site support. |  [optional] |
|**supportemail** | **String** | Site support contact email                     (only if age verification is enabled). |  [optional] |
|**supportname** | **String** | Site support contact name                     (only if age verification is enabled). |  [optional] |
|**supportpage** | **String** | Site support page link. |  [optional] |
|**toolMobileAndroidappid** | **String** | Android app&#39;s unique identifier. |  [optional] |
|**toolMobileDisabledfeatures** | **String** | Disabled features in the app |  [optional] |
|**toolMobileIosappid** | **String** | iOS app&#39;s unique identifier. |  [optional] |
|**toolMobileMinimumversion** | **String** | Minimum required version to access. |  [optional] |
|**toolMobileQrcodetype** | **Integer** | QR login configuration. |  [optional] |
|**toolMobileSetuplink** | **String** | App download page. |  [optional] |
|**typeoflogin** | **Integer** | The type of login. 1 for app, 2 for browser, 3 for embedded. |  |
|**warnings** | [**List&lt;AuthEmailSignupUser200ResponseWarningsInner&gt;**](AuthEmailSignupUser200ResponseWarningsInner.md) |  |  [optional] |
|**wwwroot** | **String** | Site URL. |  |



