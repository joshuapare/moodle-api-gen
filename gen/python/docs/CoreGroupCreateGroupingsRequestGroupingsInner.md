# CoreGroupCreateGroupingsRequestGroupingsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of course | [optional] 
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**description** | **str** | grouping description text | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **str** | id number | [optional] 
**name** | **str** | multilang compatible name, course unique | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_group_create_groupings_request_groupings_inner import CoreGroupCreateGroupingsRequestGroupingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupCreateGroupingsRequestGroupingsInner from a JSON string
core_group_create_groupings_request_groupings_inner_instance = CoreGroupCreateGroupingsRequestGroupingsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupCreateGroupingsRequestGroupingsInner.to_json())

# convert the object into a dict
core_group_create_groupings_request_groupings_inner_dict = core_group_create_groupings_request_groupings_inner_instance.to_dict()
# create an instance of CoreGroupCreateGroupingsRequestGroupingsInner from a dict
core_group_create_groupings_request_groupings_inner_from_dict = CoreGroupCreateGroupingsRequestGroupingsInner.from_dict(core_group_create_groupings_request_groupings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


