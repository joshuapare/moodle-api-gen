# MoodleClient.Model.CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | Postal address | [optional] [default to "null"]
**Auth** | **string** | Auth plugins include manual, ldap, etc | [optional] [default to "null"]
**Calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to "null"]
**City** | **string** | Home city of the user | [optional] [default to "null"]
**Confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] [default to null]
**Country** | **string** | Home country code of the user, such as AU or CZ | [optional] [default to "null"]
**Customfields** | [**List&lt;CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner&gt;**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | **string** | department | [optional] [default to "null"]
**Description** | **string** | User profile description | [optional] [default to "null"]
**Descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Email** | **string** | An email address - allow email as root@localhost | [optional] 
**Firstaccess** | **int** | first access to the site (0 if never) | [optional] [default to null]
**Firstname** | **string** | The first name(s) of the user | [optional] 
**Fullname** | **string** | The fullname of the user | [optional] [default to "null"]
**Id** | **int** | ID of the user | [optional] 
**Idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] [default to "null"]
**Institution** | **string** | institution | [optional] [default to "null"]
**Interests** | **string** | user interests (separated by commas) | [optional] [default to "null"]
**Lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to "null"]
**Lastaccess** | **int** | last access to the site (0 if never) | [optional] [default to null]
**Lastname** | **string** | The family name of the user | [optional] 
**Mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] [default to null]
**Phone1** | **string** | Phone 1 | [optional] [default to "null"]
**Phone2** | **string** | Phone 2 | [optional] [default to "null"]
**Preferences** | [**List&lt;CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner&gt;**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**Profileimageurl** | **string** | User image profile URL - big version | [optional] [default to "null"]
**Profileimageurlsmall** | **string** | User image profile URL - small version | [optional] [default to "null"]
**Suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] [default to null]
**Theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] [default to "null"]
**Timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] [default to "null"]
**Username** | **string** | The username | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

