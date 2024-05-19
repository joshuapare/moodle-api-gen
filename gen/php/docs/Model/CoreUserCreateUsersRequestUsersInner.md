# # CoreUserCreateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **string** | Postal address | [optional]
**alternatename** | **string** | The alternate name of the user | [optional] [default to 'null']
**auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to 'manual']
**calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to 'gregorian']
**city** | **string** | Home city of the user | [optional]
**country** | **string** | Home country code of the user, such as AU or CZ | [optional]
**createpassword** | **bool** | True if password should be created and mailed to user. | [optional] [default to null]
**customfields** | [**\OpenAPI\Client\Model\CoreUserCreateUsersRequestUsersInnerCustomfieldsInner[]**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional]
**department** | **string** | department | [optional]
**description** | **string** | User profile description, no HTML | [optional] [default to 'null']
**email** | **string** | A valid and unique email address | [optional]
**firstname** | **string** | The first name(s) of the user | [optional]
**firstnamephonetic** | **string** | The first name(s) phonetically of the user | [optional] [default to 'null']
**idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to '']
**institution** | **string** | institution | [optional]
**interests** | **string** | User interests (separated by commas) | [optional] [default to 'null']
**lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to 'en']
**lastname** | **string** | The family name of the user | [optional]
**lastnamephonetic** | **string** | The family name phonetically of the user | [optional] [default to 'null']
**maildisplay** | **int** | Email visibility | [optional] [default to null]
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**middlename** | **string** | The middle name of the user | [optional] [default to 'null']
**password** | **string** | Plain text password consisting of any characters | [optional] [default to 'null']
**phone1** | **string** | Phone 1 | [optional]
**phone2** | **string** | Phone 2 | [optional]
**preferences** | [**\OpenAPI\Client\Model\CoreUserCreateUsersRequestUsersInnerPreferencesInner[]**](CoreUserCreateUsersRequestUsersInnerPreferencesInner.md) |  | [optional]
**theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional]
**timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | **string** | Username policy is defined in Moodle security config. | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
