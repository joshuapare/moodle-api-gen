# CoreUserCreateUsersRequestUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Postal address | [optional] 
**alternatename** | **str** | The alternate name of the user | [optional] [default to 'null']
**auth** | **str** | Auth plugins include manual, ldap, etc | [optional] [default to 'manual']
**calendartype** | **str** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to 'gregorian']
**city** | **str** | Home city of the user | [optional] 
**country** | **str** | Home country code of the user, such as AU or CZ | [optional] 
**createpassword** | **bool** | True if password should be created and mailed to user. | [optional] [default to False]
**customfields** | [**List[CoreUserCreateUsersRequestUsersInnerCustomfieldsInner]**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  | [optional] 
**department** | **str** | department | [optional] 
**description** | **str** | User profile description, no HTML | [optional] [default to 'null']
**email** | **str** | A valid and unique email address | [optional] 
**firstname** | **str** | The first name(s) of the user | [optional] 
**firstnamephonetic** | **str** | The first name(s) phonetically of the user | [optional] [default to 'null']
**idnumber** | **str** | An arbitrary ID code number perhaps from the institution | [optional] [default to '']
**institution** | **str** | institution | [optional] 
**interests** | **str** | User interests (separated by commas) | [optional] [default to 'null']
**lang** | **str** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to 'en']
**lastname** | **str** | The family name of the user | [optional] 
**lastnamephonetic** | **str** | The family name phonetically of the user | [optional] [default to 'null']
**maildisplay** | **int** | Email visibility | [optional] [default to null]
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**middlename** | **str** | The middle name of the user | [optional] [default to 'null']
**password** | **str** | Plain text password consisting of any characters | [optional] [default to 'null']
**phone1** | **str** | Phone 1 | [optional] 
**phone2** | **str** | Phone 2 | [optional] 
**preferences** | [**List[CoreUserCreateUsersRequestUsersInnerPreferencesInner]**](CoreUserCreateUsersRequestUsersInnerPreferencesInner.md) |  | [optional] 
**theme** | **str** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**timezone** | **str** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**username** | **str** | Username policy is defined in Moodle security config. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_user_create_users_request_users_inner import CoreUserCreateUsersRequestUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserCreateUsersRequestUsersInner from a JSON string
core_user_create_users_request_users_inner_instance = CoreUserCreateUsersRequestUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreUserCreateUsersRequestUsersInner.to_json())

# convert the object into a dict
core_user_create_users_request_users_inner_dict = core_user_create_users_request_users_inner_instance.to_dict()
# create an instance of CoreUserCreateUsersRequestUsersInner from a dict
core_user_create_users_request_users_inner_from_dict = CoreUserCreateUsersRequestUsersInner.from_dict(core_user_create_users_request_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


