# Org.OpenAPITools.Model.CoreUserCreateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | Postal address | [optional] 
**Alternatename** | **string** | The alternate name of the user | [optional] [default to "null"]
**Auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to "manual"]
**Calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to "gregorian"]
**City** | **string** | Home city of the user | [optional] 
**Country** | **string** | Home country code of the user, such as AU or CZ | [optional] 
**Createpassword** | **bool** | True if password should be created and mailed to user. | [optional] [default to null]
**Customfields** | [**List&lt;CoreUserCreateUsersRequestUsersInnerCustomfieldsInner&gt;**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | **string** | department | [optional] 
**Description** | **string** | User profile description, no HTML | [optional] [default to "null"]
**Email** | **string** | A valid and unique email address | [optional] 
**Firstname** | **string** | The first name(s) of the user | [optional] 
**Firstnamephonetic** | **string** | The first name(s) phonetically of the user | [optional] [default to "null"]
**Idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to ""]
**Institution** | **string** | institution | [optional] 
**Interests** | **string** | User interests (separated by commas) | [optional] [default to "null"]
**Lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to "en"]
**Lastname** | **string** | The family name of the user | [optional] 
**Lastnamephonetic** | **string** | The family name phonetically of the user | [optional] [default to "null"]
**Maildisplay** | **int** | Email visibility | [optional] [default to null]
**Mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Middlename** | **string** | The middle name of the user | [optional] [default to "null"]
**Password** | **string** | Plain text password consisting of any characters | [optional] [default to "null"]
**Phone1** | **string** | Phone 1 | [optional] 
**Phone2** | **string** | Phone 2 | [optional] 
**Preferences** | [**List&lt;CoreUserCreateUsersRequestUsersInnerPreferencesInner&gt;**](CoreUserCreateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**Theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | **string** | Username policy is defined in Moodle security config. | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

