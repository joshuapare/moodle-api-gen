# CoreGradesGetGradableUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Postal address | [optional] 
**auth** | **str** | Auth plugins include manual, ldap, etc | [optional] 
**calendartype** | **str** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] 
**city** | **str** | Home city of the user | [optional] 
**confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] 
**country** | **str** | Home country code of the user, such as AU or CZ | [optional] 
**customfields** | [**List[CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner]**](CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**department** | **str** | department | [optional] 
**description** | **str** | User profile description | [optional] 
**descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**email** | **str** | An email address - allow email as root@localhost | [optional] 
**firstaccess** | **int** | first access to the site (0 if never) | [optional] 
**firstname** | **str** | The first name(s) of the user | [optional] 
**fullname** | **str** | The fullname of the user | [optional] 
**id** | **int** | ID of the user | [optional] 
**idnumber** | **str** | An arbitrary ID code number perhaps from the institution | [optional] 
**institution** | **str** | institution | [optional] 
**interests** | **str** | user interests (separated by commas) | [optional] 
**lang** | **str** | Language code such as \&quot;en\&quot;, must exist on server | [optional] 
**lastaccess** | **int** | last access to the site (0 if never) | [optional] 
**lastname** | **str** | The family name of the user | [optional] 
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] 
**phone1** | **str** | Phone 1 | [optional] 
**phone2** | **str** | Phone 2 | [optional] 
**preferences** | [**List[CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner]**](CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**profileimageurl** | **str** | User image profile URL - big version | [optional] 
**profileimageurlsmall** | **str** | User image profile URL - small version | [optional] 
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] 
**theme** | **str** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] 
**timezone** | **str** | Timezone code such as Australia/Perth, or 99 for default | [optional] 
**username** | **str** | The username | [optional] 

## Example

```python
from openapi_client.models.core_grades_get_gradable_users200_response_users_inner import CoreGradesGetGradableUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetGradableUsers200ResponseUsersInner from a JSON string
core_grades_get_gradable_users200_response_users_inner_instance = CoreGradesGetGradableUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetGradableUsers200ResponseUsersInner.to_json())

# convert the object into a dict
core_grades_get_gradable_users200_response_users_inner_dict = core_grades_get_gradable_users200_response_users_inner_instance.to_dict()
# create an instance of CoreGradesGetGradableUsers200ResponseUsersInner from a dict
core_grades_get_gradable_users200_response_users_inner_from_dict = CoreGradesGetGradableUsers200ResponseUsersInner.from_dict(core_grades_get_gradable_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


