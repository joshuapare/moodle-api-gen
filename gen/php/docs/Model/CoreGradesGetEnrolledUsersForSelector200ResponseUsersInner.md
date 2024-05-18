# # CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **string** | Postal address | [optional] [default to 'null']
**auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to 'null']
**calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to 'null']
**city** | **string** | Home city of the user | [optional] [default to 'null']
**confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] [default to null]
**country** | **string** | Home country code of the user, such as AU or CZ | [optional] [default to 'null']
**customfields** | [**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner[]**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md) |  | [optional]
**department** | **string** | department | [optional] [default to 'null']
**description** | **string** | User profile description | [optional] [default to 'null']
**descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**email** | **string** | An email address - allow email as root@localhost | [optional]
**firstaccess** | **int** | first access to the site (0 if never) | [optional] [default to null]
**firstname** | **string** | The first name(s) of the user | [optional]
**fullname** | **string** | The fullname of the user | [optional] [default to 'null']
**id** | **int** | ID of the user | [optional]
**idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to 'null']
**institution** | **string** | institution | [optional] [default to 'null']
**interests** | **string** | user interests (separated by commas) | [optional] [default to 'null']
**lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to 'null']
**lastaccess** | **int** | last access to the site (0 if never) | [optional] [default to null]
**lastname** | **string** | The family name of the user | [optional]
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] [default to null]
**phone1** | **string** | Phone 1 | [optional] [default to 'null']
**phone2** | **string** | Phone 2 | [optional] [default to 'null']
**preferences** | [**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner[]**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md) |  | [optional]
**profileimageurl** | **string** | User image profile URL - big version | [optional] [default to 'null']
**profileimageurlsmall** | **string** | User image profile URL - small version | [optional] [default to 'null']
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] [default to null]
**theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] [default to 'null']
**timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] [default to 'null']
**username** | **string** | The username | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
