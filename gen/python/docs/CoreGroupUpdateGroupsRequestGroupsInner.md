# CoreGroupUpdateGroupsRequestGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | group description text | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**enrolmentkey** | **str** | group enrol secret phrase | [optional] 
**id** | **int** | ID of the group | [optional] [default to null]
**idnumber** | **str** | id number | [optional] 
**name** | **str** | multilang compatible name, course unique | [optional] 
**participation** | **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility | [optional] [default to False]
**visibility** | **str** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_group_update_groups_request_groups_inner import CoreGroupUpdateGroupsRequestGroupsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupUpdateGroupsRequestGroupsInner from a JSON string
core_group_update_groups_request_groups_inner_instance = CoreGroupUpdateGroupsRequestGroupsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupUpdateGroupsRequestGroupsInner.to_json())

# convert the object into a dict
core_group_update_groups_request_groups_inner_dict = core_group_update_groups_request_groups_inner_instance.to_dict()
# create an instance of CoreGroupUpdateGroupsRequestGroupsInner from a dict
core_group_update_groups_request_groups_inner_from_dict = CoreGroupUpdateGroupsRequestGroupsInner.from_dict(core_group_update_groups_request_groups_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


