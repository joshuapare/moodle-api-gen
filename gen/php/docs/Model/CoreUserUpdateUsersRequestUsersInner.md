# # CoreUserUpdateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **string** | Postal address | [optional]
**alternatename** | **string** | The alternate name of the user | [optional]
**auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to '']
**calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to '']
**city** | **string** | Home city of the user | [optional]
**country** | **string** | Home country code of the user, such as AU or CZ | [optional]
**customfields** | [**\OpenAPI\Client\Model\CoreUserCreateUsersRequestUsersInnerCustomfieldsInner[]**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional]
**department** | **string** | Department | [optional] [default to 'null']
**description** | **string** | User profile description, no HTML | [optional]
**email** | **string** | A valid and unique email address | [optional] [default to '']
**firstname** | **string** | The first name(s) of the user | [optional] [default to '']
**firstnamephonetic** | **string** | The first name(s) phonetically of the user | [optional]
**id** | **int** | ID of the user | [optional]
**idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional]
**institution** | **string** | Institution | [optional] [default to 'null']
**interests** | **string** | User interests (separated by commas) | [optional]
**lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to '']
**lastname** | **string** | The family name of the user | [optional]
**lastnamephonetic** | **string** | The family name phonetically of the user | [optional]
**maildisplay** | **int** | Email visibility | [optional]
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**middlename** | **string** | The middle name of the user | [optional]
**password** | **string** | Plain text password consisting of any characters | [optional] [default to '']
**phone1** | **string** | Phone | [optional] [default to 'null']
**phone2** | **string** | Mobile phone | [optional] [default to 'null']
**preferences** | [**\OpenAPI\Client\Model\CoreUserUpdateUsersRequestUsersInnerPreferencesInner[]**](CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md) |  | [optional]
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional]
**theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional]
**timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | **string** | Username policy is defined in Moodle security config. | [optional] [default to '']
**userpicture** | **int** | The itemid where the new user picture has been uploaded to, 0 to delete | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
