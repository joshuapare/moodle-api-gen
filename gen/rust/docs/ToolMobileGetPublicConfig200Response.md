# ToolMobileGetPublicConfig200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agedigitalconsentverification** | Option<**bool**> | Whether age digital consent verification                     is enabled. | [optional][default to null]
**authinstructions** | **String** | Authentication instructions. | [default to null]
**authloginviaemail** | **i32** | Whether log in via email is enabled. | [default to null]
**authnoneenabled** | **i32** | Whether auth none is enabled. | [default to null]
**autolang** | Option<**i32**> | Whether to detect default language                     from browser setting. | [optional][default to null]
**compactlogourl** | Option<**String**> | The site compact logo URL | [optional][default to null]
**country** | Option<**String**> | Default site country | [optional][default to null]
**enablemobilewebservice** | **i32** | Whether the Mobile service is enabled. | [default to null]
**enablewebservices** | **i32** | Whether Web Services are enabled. | [default to null]
**forgottenpasswordurl** | **String** | Forgotten password URL. | [default to null]
**guestlogin** | **i32** | Whether guest login is enabled. | [default to null]
**httpswwwroot** | **String** | Site https URL (if httpslogin is enabled). | [default to null]
**identityproviders** | Option<[**Vec<models::ToolMobileGetPublicConfig200ResponseIdentityprovidersInner>**](tool_mobile_get_public_config_200_response_identityproviders_inner.md)> |  | [optional]
**lang** | Option<**String**> | Default language for the site. | [optional][default to null]
**langlist** | Option<**String**> | Languages on language menu. | [optional][default to null]
**langmenu** | Option<**i32**> | Whether the language menu should be displayed. | [optional][default to null]
**launchurl** | Option<**String**> | SSO login launch URL. | [optional][default to null]
**locale** | Option<**String**> | Sitewide locale. | [optional][default to null]
**logourl** | Option<**String**> | The site logo URL | [optional][default to null]
**maintenanceenabled** | **i32** | Whether site maintenance is enabled. | [default to null]
**maintenancemessage** | **String** | Maintenance message. | [default to null]
**mobilecssurl** | Option<**String**> | Mobile custom CSS theme | [optional]
**registerauth** | **String** | Authentication method for user registration. | [default to null]
**rememberusername** | **i32** | Values: 0 for No, 1 for Yes, 2 for optional. | [default to null]
**sitename** | **String** | Site name. | [default to null]
**supportavailability** | Option<**i32**> | Determines who has access to contact site support. | [optional][default to null]
**supportemail** | Option<**String**> | Site support contact email                     (only if age verification is enabled). | [optional][default to null]
**supportname** | Option<**String**> | Site support contact name                     (only if age verification is enabled). | [optional][default to null]
**supportpage** | Option<**String**> | Site support page link. | [optional][default to null]
**tool_mobile_androidappid** | Option<**String**> | Android app's unique identifier. | [optional][default to null]
**tool_mobile_disabledfeatures** | Option<**String**> | Disabled features in the app | [optional][default to null]
**tool_mobile_iosappid** | Option<**String**> | iOS app's unique identifier. | [optional][default to null]
**tool_mobile_minimumversion** | Option<**String**> | Minimum required version to access. | [optional][default to null]
**tool_mobile_qrcodetype** | Option<**i32**> | QR login configuration. | [optional][default to null]
**tool_mobile_setuplink** | Option<**String**> | App download page. | [optional][default to null]
**typeoflogin** | **i32** | The type of login. 1 for app, 2 for browser, 3 for embedded. | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]
**wwwroot** | **String** | Site URL. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


