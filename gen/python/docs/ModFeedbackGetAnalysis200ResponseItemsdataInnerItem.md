# ModFeedbackGetAnalysis200ResponseItemsdataInnerItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependitem** | **int** | The item id this item depend on. | [default to 0]
**dependvalue** | **str** | The depend value. | [default to 'null']
**feedback** | **int** | The feedback instance id this records belongs to. | [default to 0]
**hasvalue** | **int** | Whether it has a value or not. | [default to 0]
**id** | **int** | The record id. | [default to null]
**itemfiles** | [**List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | 
**itemnumber** | **int** | The item position number | [default to null]
**label** | **str** | The item label. | [default to 'null']
**name** | **str** | The item name. | [default to 'null']
**options** | **str** | Different additional settings for the item (question). | [default to 'null']
**otherdata** | **str** | Additional data that may be required by external functions | [default to 'null']
**position** | **int** | The position in the list of questions. | [default to 0]
**presentation** | **str** | The text describing the item or the available possible answers. | [default to 'null']
**required** | **bool** | Whether is a item (question) required or not. | [default to False]
**template** | **int** | If it belogns to a template, the template id. | [default to 0]
**typ** | **str** | The type of the item. | [default to 'null']

## Example

```python
from openapi_client.models.mod_feedback_get_analysis200_response_itemsdata_inner_item import ModFeedbackGetAnalysis200ResponseItemsdataInnerItem

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetAnalysis200ResponseItemsdataInnerItem from a JSON string
mod_feedback_get_analysis200_response_itemsdata_inner_item_instance = ModFeedbackGetAnalysis200ResponseItemsdataInnerItem.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetAnalysis200ResponseItemsdataInnerItem.to_json())

# convert the object into a dict
mod_feedback_get_analysis200_response_itemsdata_inner_item_dict = mod_feedback_get_analysis200_response_itemsdata_inner_item_instance.to_dict()
# create an instance of ModFeedbackGetAnalysis200ResponseItemsdataInnerItem from a dict
mod_feedback_get_analysis200_response_itemsdata_inner_item_from_dict = ModFeedbackGetAnalysis200ResponseItemsdataInnerItem.from_dict(mod_feedback_get_analysis200_response_itemsdata_inner_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


