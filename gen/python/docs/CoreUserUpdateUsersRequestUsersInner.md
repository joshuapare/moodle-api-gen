# CoreUserUpdateUsersRequestUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Postal address | [optional] 
**alternatename** | **str** | The alternate name of the user | [optional] 
**auth** | **str** | Auth plugins include manual, ldap, etc | [optional] [default to '']
**calendartype** | **str** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to '']
**city** | **str** | Home city of the user | [optional] 
**country** | **str** | Home country code of the user, such as AU or CZ | [optional] 
**customfields** | [**List[CoreUserCreateUsersRequestUsersInnerCustomfieldsInner]**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**department** | **str** | Department | [optional] [default to 'null']
**description** | **str** | User profile description, no HTML | [optional] 
**email** | **str** | A valid and unique email address | [optional] [default to '']
**firstname** | **str** | The first name(s) of the user | [optional] [default to '']
**firstnamephonetic** | **str** | The first name(s) phonetically of the user | [optional] 
**id** | **int** | ID of the user | [optional] 
**idnumber** | **str** | An arbitrary ID code number perhaps from the institution | [optional] 
**institution** | **str** | Institution | [optional] [default to 'null']
**interests** | **str** | User interests (separated by commas) | [optional] 
**lang** | **str** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to '']
**lastname** | **str** | The family name of the user | [optional] 
**lastnamephonetic** | **str** | The family name phonetically of the user | [optional] 
**maildisplay** | **int** | Email visibility | [optional] 
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**middlename** | **str** | The middle name of the user | [optional] 
**password** | **str** | Plain text password consisting of any characters | [optional] [default to '']
**phone1** | **str** | Phone | [optional] [default to 'null']
**phone2** | **str** | Mobile phone | [optional] [default to 'null']
**preferences** | [**List[CoreUserUpdateUsersRequestUsersInnerPreferencesInner]**](CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**theme** | **str** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**timezone** | **str** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**username** | **str** | Username policy is defined in Moodle security config. | [optional] [default to '']
**userpicture** | **int** | The itemid where the new user picture has been uploaded to, 0 to delete | [optional] [default to null]

## Example

```python
from openapi_client.models.core_user_update_users_request_users_inner import CoreUserUpdateUsersRequestUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdateUsersRequestUsersInner from a JSON string
core_user_update_users_request_users_inner_instance = CoreUserUpdateUsersRequestUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdateUsersRequestUsersInner.to_json())

# convert the object into a dict
core_user_update_users_request_users_inner_dict = core_user_update_users_request_users_inner_instance.to_dict()
# create an instance of CoreUserUpdateUsersRequestUsersInner from a dict
core_user_update_users_request_users_inner_from_dict = CoreUserUpdateUsersRequestUsersInner.from_dict(core_user_update_users_request_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


