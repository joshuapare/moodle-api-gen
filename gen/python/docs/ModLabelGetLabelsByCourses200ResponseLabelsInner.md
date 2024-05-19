# ModLabelGetLabelsByCourses200ResponseLabelsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**section** | **int** | Course section id | [optional] 
**timemodified** | **int** | Last time the label was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_label_get_labels_by_courses200_response_labels_inner import ModLabelGetLabelsByCourses200ResponseLabelsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLabelGetLabelsByCourses200ResponseLabelsInner from a JSON string
mod_label_get_labels_by_courses200_response_labels_inner_instance = ModLabelGetLabelsByCourses200ResponseLabelsInner.from_json(json)
# print the JSON string representation of the object
print(ModLabelGetLabelsByCourses200ResponseLabelsInner.to_json())

# convert the object into a dict
mod_label_get_labels_by_courses200_response_labels_inner_dict = mod_label_get_labels_by_courses200_response_labels_inner_instance.to_dict()
# create an instance of ModLabelGetLabelsByCourses200ResponseLabelsInner from a dict
mod_label_get_labels_by_courses200_response_labels_inner_from_dict = ModLabelGetLabelsByCourses200ResponseLabelsInner.from_dict(mod_label_get_labels_by_courses200_response_labels_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


