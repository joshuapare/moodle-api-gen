# MoodleClient.Model.CoreGradesGetGradableUsers200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | Postal address | [optional] 
**Auth** | **string** | Auth plugins include manual, ldap, etc | [optional] 
**Calendartype** | **string** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] 
**City** | **string** | Home city of the user | [optional] 
**Confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] 
**Country** | **string** | Home country code of the user, such as AU or CZ | [optional] 
**Customfields** | [**List&lt;CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner&gt;**](CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**Department** | **string** | department | [optional] 
**Description** | **string** | User profile description | [optional] 
**Descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Email** | **string** | An email address - allow email as root@localhost | [optional] 
**Firstaccess** | **int** | first access to the site (0 if never) | [optional] 
**Firstname** | **string** | The first name(s) of the user | [optional] 
**Fullname** | **string** | The fullname of the user | [optional] 
**Id** | **int** | ID of the user | [optional] 
**Idnumber** | **string** | An arbitrary ID code number perhaps from the institution | [optional] 
**Institution** | **string** | institution | [optional] 
**Interests** | **string** | user interests (separated by commas) | [optional] 
**Lang** | **string** | Language code such as \&quot;en\&quot;, must exist on server | [optional] 
**Lastaccess** | **int** | last access to the site (0 if never) | [optional] 
**Lastname** | **string** | The family name of the user | [optional] 
**Mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**Phone1** | **string** | Phone 1 | [optional] 
**Phone2** | **string** | Phone 2 | [optional] 
**Preferences** | [**List&lt;CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner&gt;**](CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**Profileimageurl** | **string** | User image profile URL - big version | [optional] 
**Profileimageurlsmall** | **string** | User image profile URL - small version | [optional] 
**Suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**Theme** | **string** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**Timezone** | **string** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**Username** | **string** | The username | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

