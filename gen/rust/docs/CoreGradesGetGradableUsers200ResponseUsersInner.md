# CoreGradesGetGradableUsers200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<**String**> | Postal address | [optional]
**auth** | Option<**String**> | Auth plugins include manual, ldap, etc | [optional]
**calendartype** | Option<**String**> | Calendar type such as \"gregorian\", must exist on server | [optional]
**city** | Option<**String**> | Home city of the user | [optional]
**confirmed** | Option<**bool**> | Active user: 1 if confirmed, 0 otherwise | [optional]
**country** | Option<**String**> | Home country code of the user, such as AU or CZ | [optional]
**customfields** | Option<[**Vec<models::CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner>**](core_grades_get_gradable_users_200_response_users_inner_customfields_inner.md)> |  | [optional]
**department** | Option<**String**> | department | [optional]
**description** | Option<**String**> | User profile description | [optional]
**descriptionformat** | Option<**i32**> | int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**email** | Option<**String**> | An email address - allow email as root@localhost | [optional]
**firstaccess** | Option<**i32**> | first access to the site (0 if never) | [optional]
**firstname** | Option<**String**> | The first name(s) of the user | [optional]
**fullname** | Option<**String**> | The fullname of the user | [optional]
**id** | Option<**i32**> | ID of the user | [optional]
**idnumber** | Option<**String**> | An arbitrary ID code number perhaps from the institution | [optional]
**institution** | Option<**String**> | institution | [optional]
**interests** | Option<**String**> | user interests (separated by commas) | [optional]
**lang** | Option<**String**> | Language code such as \"en\", must exist on server | [optional]
**lastaccess** | Option<**i32**> | last access to the site (0 if never) | [optional]
**lastname** | Option<**String**> | The family name of the user | [optional]
**mailformat** | Option<**i32**> | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**phone1** | Option<**String**> | Phone 1 | [optional]
**phone2** | Option<**String**> | Phone 2 | [optional]
**preferences** | Option<[**Vec<models::CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner>**](core_grades_get_gradable_users_200_response_users_inner_preferences_inner.md)> |  | [optional]
**profileimageurl** | Option<**String**> | User image profile URL - big version | [optional]
**profileimageurlsmall** | Option<**String**> | User image profile URL - small version | [optional]
**suspended** | Option<**bool**> | Suspend user account, either false to enable user login or true to disable it | [optional]
**theme** | Option<**String**> | Theme name such as \"standard\", must exist on server | [optional]
**timezone** | Option<**String**> | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | Option<**String**> | The username | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


