# CoreGroupGetActivityAllowedGroups200ResponseGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [optional] 
**description** | **str** | group description text | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | group record id | [optional] 
**idnumber** | **str** | id number | [optional] 
**name** | **str** | group name | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_group_get_activity_allowed_groups200_response_groups_inner import CoreGroupGetActivityAllowedGroups200ResponseGroupsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetActivityAllowedGroups200ResponseGroupsInner from a JSON string
core_group_get_activity_allowed_groups200_response_groups_inner_instance = CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.to_json())

# convert the object into a dict
core_group_get_activity_allowed_groups200_response_groups_inner_dict = core_group_get_activity_allowed_groups200_response_groups_inner_instance.to_dict()
# create an instance of CoreGroupGetActivityAllowedGroups200ResponseGroupsInner from a dict
core_group_get_activity_allowed_groups200_response_groups_inner_from_dict = CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.from_dict(core_group_get_activity_allowed_groups200_response_groups_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


