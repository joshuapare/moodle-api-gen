# ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] [default to null]
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] [default to null]
**intro** | **str** | Activity introduction | [optional] [default to 'null']
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] [default to 'null']
**meetingid** | **str** | Meeting id | [optional] [default to 'null']
**name** | **str** | Activity name | [optional] 
**section** | **int** | Course section id | [optional] [default to null]
**timemodified** | **int** | Last time the instance was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner import ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner from a JSON string
mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner_instance = ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner_dict = mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner from a dict
mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner_from_dict = ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.from_dict(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses200_response_bigbluebuttonbns_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


