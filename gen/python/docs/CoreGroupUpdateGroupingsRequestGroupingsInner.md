# CoreGroupUpdateGroupingsRequestGroupingsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | grouping description text | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id of grouping | [optional] [default to null]
**idnumber** | **str** | id number | [optional] 
**name** | **str** | multilang compatible name, course unique | [optional] 

## Example

```python
from openapi_client.models.core_group_update_groupings_request_groupings_inner import CoreGroupUpdateGroupingsRequestGroupingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupUpdateGroupingsRequestGroupingsInner from a JSON string
core_group_update_groupings_request_groupings_inner_instance = CoreGroupUpdateGroupingsRequestGroupingsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupUpdateGroupingsRequestGroupingsInner.to_json())

# convert the object into a dict
core_group_update_groupings_request_groupings_inner_dict = core_group_update_groupings_request_groupings_inner_instance.to_dict()
# create an instance of CoreGroupUpdateGroupingsRequestGroupingsInner from a dict
core_group_update_groupings_request_groupings_inner_from_dict = CoreGroupUpdateGroupingsRequestGroupingsInner.from_dict(core_group_update_groupings_request_groupings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


