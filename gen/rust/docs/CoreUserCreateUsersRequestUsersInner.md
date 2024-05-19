# CoreUserCreateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<**String**> | Postal address | [optional]
**alternatename** | Option<**String**> | The alternate name of the user | [optional][default to null]
**auth** | Option<**String**> | Auth plugins include manual, ldap, etc | [optional][default to manual]
**calendartype** | Option<**String**> | Calendar type such as \"gregorian\", must exist on server | [optional][default to gregorian]
**city** | Option<**String**> | Home city of the user | [optional]
**country** | Option<**String**> | Home country code of the user, such as AU or CZ | [optional]
**createpassword** | Option<**bool**> | True if password should be created and mailed to user. | [optional][default to null]
**customfields** | Option<[**Vec<models::CoreUserCreateUsersRequestUsersInnerCustomfieldsInner>**](core_user_create_users_request_users_inner_customfields_inner.md)> |  | [optional]
**department** | Option<**String**> | department | [optional]
**description** | Option<**String**> | User profile description, no HTML | [optional][default to null]
**email** | Option<**String**> | A valid and unique email address | [optional]
**firstname** | Option<**String**> | The first name(s) of the user | [optional]
**firstnamephonetic** | Option<**String**> | The first name(s) phonetically of the user | [optional][default to null]
**idnumber** | Option<**String**> | An arbitrary ID code number perhaps from the institution | [optional][default to ]
**institution** | Option<**String**> | institution | [optional]
**interests** | Option<**String**> | User interests (separated by commas) | [optional][default to null]
**lang** | Option<**String**> | Language code such as \"en\", must exist on server | [optional][default to en]
**lastname** | Option<**String**> | The family name of the user | [optional]
**lastnamephonetic** | Option<**String**> | The family name phonetically of the user | [optional][default to null]
**maildisplay** | Option<**i32**> | Email visibility | [optional][default to null]
**mailformat** | Option<**i32**> | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**middlename** | Option<**String**> | The middle name of the user | [optional][default to null]
**password** | Option<**String**> | Plain text password consisting of any characters | [optional][default to null]
**phone1** | Option<**String**> | Phone 1 | [optional]
**phone2** | Option<**String**> | Phone 2 | [optional]
**preferences** | Option<[**Vec<models::CoreUserCreateUsersRequestUsersInnerPreferencesInner>**](core_user_create_users_request_users_inner_preferences_inner.md)> |  | [optional]
**theme** | Option<**String**> | Theme name such as \"standard\", must exist on server | [optional]
**timezone** | Option<**String**> | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | Option<**String**> | Username policy is defined in Moodle security config. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


