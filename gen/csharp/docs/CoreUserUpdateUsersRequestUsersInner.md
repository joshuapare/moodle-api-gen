# MoodleClient.Model.CoreUserUpdateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | Postal address | [optional] 
**Alternatename** | **string** | The alternate name of the user | [optional] 
**Auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to ""]
**Calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to ""]
**City** | **string** | Home city of the user | [optional] 
**Country** | **string** | Home country code of the user, such as AU or CZ | [optional] 
**Customfields** | [**List&lt;CoreUserCreateUsersRequestUsersInnerCustomfieldsInner&gt;**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | **string** | Department | [optional] [default to "null"]
**Description** | **string** | User profile description, no HTML | [optional] 
**Email** | **string** | A valid and unique email address | [optional] [default to ""]
**Firstname** | **string** | The first name(s) of the user | [optional] [default to ""]
**Firstnamephonetic** | **string** | The first name(s) phonetically of the user | [optional] 
**Id** | **int** | ID of the user | [optional] 
**Idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] 
**Institution** | **string** | Institution | [optional] [default to "null"]
**Interests** | **string** | User interests (separated by commas) | [optional] 
**Lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to ""]
**Lastname** | **string** | The family name of the user | [optional] 
**Lastnamephonetic** | **string** | The family name phonetically of the user | [optional] 
**Maildisplay** | **int** | Email visibility | [optional] 
**Mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Middlename** | **string** | The middle name of the user | [optional] 
**Password** | **string** | Plain text password consisting of any characters | [optional] [default to ""]
**Phone1** | **string** | Phone | [optional] [default to "null"]
**Phone2** | **string** | Mobile phone | [optional] [default to "null"]
**Preferences** | [**List&lt;CoreUserUpdateUsersRequestUsersInnerPreferencesInner&gt;**](CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**Suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**Theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | **string** | Username policy is defined in Moodle security config. | [optional] [default to ""]
**Userpicture** | **int** | The itemid where the new user picture has been uploaded to, 0 to delete | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

