# ModFeedbackGetItems200ResponseItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependitem** | **int** | The item id this item depend on. | [optional] [default to 0]
**dependvalue** | **str** | The depend value. | [optional] 
**feedback** | **int** | The feedback instance id this records belongs to. | [optional] [default to 0]
**hasvalue** | **int** | Whether it has a value or not. | [optional] [default to 0]
**id** | **int** | The record id. | [optional] 
**itemfiles** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**itemnumber** | **int** | The item position number | [optional] 
**label** | **str** | The item label. | [optional] 
**name** | **str** | The item name. | [optional] 
**options** | **str** | Different additional settings for the item (question). | [optional] 
**otherdata** | **str** | Additional data that may be required by external functions | [optional] 
**position** | **int** | The position in the list of questions. | [optional] [default to 0]
**presentation** | **str** | The text describing the item or the available possible answers. | [optional] 
**required** | **bool** | Whether is a item (question) required or not. | [optional] [default to False]
**template** | **int** | If it belogns to a template, the template id. | [optional] [default to 0]
**typ** | **str** | The type of the item. | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_items200_response_items_inner import ModFeedbackGetItems200ResponseItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetItems200ResponseItemsInner from a JSON string
mod_feedback_get_items200_response_items_inner_instance = ModFeedbackGetItems200ResponseItemsInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetItems200ResponseItemsInner.to_json())

# convert the object into a dict
mod_feedback_get_items200_response_items_inner_dict = mod_feedback_get_items200_response_items_inner_instance.to_dict()
# create an instance of ModFeedbackGetItems200ResponseItemsInner from a dict
mod_feedback_get_items200_response_items_inner_from_dict = ModFeedbackGetItems200ResponseItemsInner.from_dict(mod_feedback_get_items200_response_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


