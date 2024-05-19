# # CoreGradesGetGradableUsers200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **string** | Postal address | [optional]
**auth** | **string** | Auth plugins include manual, ldap, etc | [optional]
**calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional]
**city** | **string** | Home city of the user | [optional]
**confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional]
**country** | **string** | Home country code of the user, such as AU or CZ | [optional]
**customfields** | [**\OpenAPI\Client\Model\CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner[]**](CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md) |  | [optional]
**department** | **string** | department | [optional]
**description** | **string** | User profile description | [optional]
**descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**email** | **string** | An email address - allow email as root@localhost | [optional]
**firstaccess** | **int** | first access to the site (0 if never) | [optional]
**firstname** | **string** | The first name(s) of the user | [optional]
**fullname** | **string** | The fullname of the user | [optional]
**id** | **int** | ID of the user | [optional]
**idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional]
**institution** | **string** | institution | [optional]
**interests** | **string** | user interests (separated by commas) | [optional]
**lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional]
**lastaccess** | **int** | last access to the site (0 if never) | [optional]
**lastname** | **string** | The family name of the user | [optional]
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**phone1** | **string** | Phone 1 | [optional]
**phone2** | **string** | Phone 2 | [optional]
**preferences** | [**\OpenAPI\Client\Model\CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner[]**](CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md) |  | [optional]
**profileimageurl** | **string** | User image profile URL - big version | [optional]
**profileimageurlsmall** | **string** | User image profile URL - small version | [optional]
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional]
**theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional]
**timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | **string** | The username | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
