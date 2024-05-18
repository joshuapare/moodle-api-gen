# CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<**String**> | Postal address | [optional][default to null]
**auth** | Option<**String**> | Auth plugins include manual, ldap, etc | [optional][default to null]
**calendartype** | Option<**String**> | Calendar type such as \"gregorian\", must exist on server | [optional][default to null]
**city** | Option<**String**> | Home city of the user | [optional][default to null]
**confirmed** | Option<**bool**> | Active user: 1 if confirmed, 0 otherwise | [optional][default to null]
**country** | Option<**String**> | Home country code of the user, such as AU or CZ | [optional][default to null]
**customfields** | Option<[**Vec<models::CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner>**](core_grades_get_enrolled_users_for_selector_200_response_users_inner_customfields_inner.md)> |  | [optional]
**department** | Option<**String**> | department | [optional][default to null]
**description** | Option<**String**> | User profile description | [optional][default to null]
**descriptionformat** | Option<**i32**> | int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**email** | Option<**String**> | An email address - allow email as root@localhost | [optional]
**firstaccess** | Option<**i32**> | first access to the site (0 if never) | [optional][default to null]
**firstname** | Option<**String**> | The first name(s) of the user | [optional]
**fullname** | Option<**String**> | The fullname of the user | [optional][default to null]
**id** | Option<**i32**> | ID of the user | [optional]
**idnumber** | Option<**String**> | An arbitrary ID code number perhaps from the institution | [optional][default to null]
**institution** | Option<**String**> | institution | [optional][default to null]
**interests** | Option<**String**> | user interests (separated by commas) | [optional][default to null]
**lang** | Option<**String**> | Language code such as \"en\", must exist on server | [optional][default to null]
**lastaccess** | Option<**i32**> | last access to the site (0 if never) | [optional][default to null]
**lastname** | Option<**String**> | The family name of the user | [optional]
**mailformat** | Option<**i32**> | Mail format code is 0 for plain text, 1 for HTML etc | [optional][default to null]
**phone1** | Option<**String**> | Phone 1 | [optional][default to null]
**phone2** | Option<**String**> | Phone 2 | [optional][default to null]
**preferences** | Option<[**Vec<models::CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner>**](core_grades_get_enrolled_users_for_selector_200_response_users_inner_preferences_inner.md)> |  | [optional]
**profileimageurl** | Option<**String**> | User image profile URL - big version | [optional][default to null]
**profileimageurlsmall** | Option<**String**> | User image profile URL - small version | [optional][default to null]
**suspended** | Option<**bool**> | Suspend user account, either false to enable user login or true to disable it | [optional][default to null]
**theme** | Option<**String**> | Theme name such as \"standard\", must exist on server | [optional][default to null]
**timezone** | Option<**String**> | Timezone code such as Australia/Perth, or 99 for default | [optional][default to null]
**username** | Option<**String**> | The username | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


