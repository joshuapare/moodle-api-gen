# CoreUserUpdateUsersRequestUsersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<**String**> | Postal address | [optional]
**alternatename** | Option<**String**> | The alternate name of the user | [optional]
**auth** | Option<**String**> | Auth plugins include manual, ldap, etc | [optional][default to ]
**calendartype** | Option<**String**> | Calendar type such as \"gregorian\", must exist on server | [optional][default to ]
**city** | Option<**String**> | Home city of the user | [optional]
**country** | Option<**String**> | Home country code of the user, such as AU or CZ | [optional]
**customfields** | Option<[**Vec<models::CoreUserCreateUsersRequestUsersInnerCustomfieldsInner>**](core_user_create_users_request_users_inner_customfields_inner.md)> |  | [optional]
**department** | Option<**String**> | Department | [optional][default to null]
**description** | Option<**String**> | User profile description, no HTML | [optional]
**email** | Option<**String**> | A valid and unique email address | [optional][default to ]
**firstname** | Option<**String**> | The first name(s) of the user | [optional][default to ]
**firstnamephonetic** | Option<**String**> | The first name(s) phonetically of the user | [optional]
**id** | Option<**i32**> | ID of the user | [optional]
**idnumber** | Option<**String**> | An arbitrary ID code number perhaps from the institution | [optional]
**institution** | Option<**String**> | Institution | [optional][default to null]
**interests** | Option<**String**> | User interests (separated by commas) | [optional]
**lang** | Option<**String**> | Language code such as \"en\", must exist on server | [optional][default to ]
**lastname** | Option<**String**> | The family name of the user | [optional]
**lastnamephonetic** | Option<**String**> | The family name phonetically of the user | [optional]
**maildisplay** | Option<**i32**> | Email visibility | [optional]
**mailformat** | Option<**i32**> | Mail format code is 0 for plain text, 1 for HTML etc | [optional]
**middlename** | Option<**String**> | The middle name of the user | [optional]
**password** | Option<**String**> | Plain text password consisting of any characters | [optional][default to ]
**phone1** | Option<**String**> | Phone | [optional][default to null]
**phone2** | Option<**String**> | Mobile phone | [optional][default to null]
**preferences** | Option<[**Vec<models::CoreUserUpdateUsersRequestUsersInnerPreferencesInner>**](core_user_update_users_request_users_inner_preferences_inner.md)> |  | [optional]
**suspended** | Option<**bool**> | Suspend user account, either false to enable user login or true to disable it | [optional]
**theme** | Option<**String**> | Theme name such as \"standard\", must exist on server | [optional]
**timezone** | Option<**String**> | Timezone code such as Australia/Perth, or 99 for default | [optional]
**username** | Option<**String**> | Username policy is defined in Moodle security config. | [optional][default to ]
**userpicture** | Option<**i32**> | The itemid where the new user picture has been uploaded to, 0 to delete | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


