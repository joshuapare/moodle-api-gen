# CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Postal address | [optional] [default to 'null']
**auth** | **str** | Auth plugins include manual, ldap, etc | [optional] [default to 'null']
**calendartype** | **str** | Calendar type such as \&quot;gregorian\&quot;, must exist on server | [optional] [default to 'null']
**city** | **str** | Home city of the user | [optional] [default to 'null']
**confirmed** | **bool** | Active user: 1 if confirmed, 0 otherwise | [optional] [default to False]
**country** | **str** | Home country code of the user, such as AU or CZ | [optional] [default to 'null']
**customfields** | [**List[CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner]**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md) |  | [optional] 
**department** | **str** | department | [optional] [default to 'null']
**description** | **str** | User profile description | [optional] [default to 'null']
**descriptionformat** | **int** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**email** | **str** | An email address - allow email as root@localhost | [optional] 
**firstaccess** | **int** | first access to the site (0 if never) | [optional] [default to null]
**firstname** | **str** | The first name(s) of the user | [optional] 
**fullname** | **str** | The fullname of the user | [optional] [default to 'null']
**id** | **int** | ID of the user | [optional] 
**idnumber** | **str** | An arbitrary ID code number perhaps from the institution | [optional] [default to 'null']
**institution** | **str** | institution | [optional] [default to 'null']
**interests** | **str** | user interests (separated by commas) | [optional] [default to 'null']
**lang** | **str** | Language code such as \&quot;en\&quot;, must exist on server | [optional] [default to 'null']
**lastaccess** | **int** | last access to the site (0 if never) | [optional] [default to null]
**lastname** | **str** | The family name of the user | [optional] 
**mailformat** | **int** | Mail format code is 0 for plain text, 1 for HTML etc | [optional] [default to null]
**phone1** | **str** | Phone 1 | [optional] [default to 'null']
**phone2** | **str** | Phone 2 | [optional] [default to 'null']
**preferences** | [**List[CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner]**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md) |  | [optional] 
**profileimageurl** | **str** | User image profile URL - big version | [optional] [default to 'null']
**profileimageurlsmall** | **str** | User image profile URL - small version | [optional] [default to 'null']
**suspended** | **bool** | Suspend user account, either false to enable user login or true to disable it | [optional] [default to False]
**theme** | **str** | Theme name such as \&quot;standard\&quot;, must exist on server | [optional] [default to 'null']
**timezone** | **str** | Timezone code such as Australia/Perth, or 99 for default | [optional] [default to 'null']
**username** | **str** | The username | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_grades_get_enrolled_users_for_selector200_response_users_inner import CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner from a JSON string
core_grades_get_enrolled_users_for_selector200_response_users_inner_instance = CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.to_json())

# convert the object into a dict
core_grades_get_enrolled_users_for_selector200_response_users_inner_dict = core_grades_get_enrolled_users_for_selector200_response_users_inner_instance.to_dict()
# create an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner from a dict
core_grades_get_enrolled_users_for_selector200_response_users_inner_from_dict = CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.from_dict(core_grades_get_enrolled_users_for_selector200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


