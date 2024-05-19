# ModFeedbackGetItems200ResponseItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependitem** | Option<**i32**> | The item id this item depend on. | [optional][default to 0]
**dependvalue** | Option<**String**> | The depend value. | [optional]
**feedback** | Option<**i32**> | The feedback instance id this records belongs to. | [optional][default to 0]
**hasvalue** | Option<**i32**> | Whether it has a value or not. | [optional][default to 0]
**id** | Option<**i32**> | The record id. | [optional]
**itemfiles** | Option<[**Vec<models::ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>**](mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner.md)> |  | [optional]
**itemnumber** | Option<**i32**> | The item position number | [optional]
**label** | Option<**String**> | The item label. | [optional]
**name** | Option<**String**> | The item name. | [optional]
**options** | Option<**String**> | Different additional settings for the item (question). | [optional]
**otherdata** | Option<**String**> | Additional data that may be required by external functions | [optional]
**position** | Option<**i32**> | The position in the list of questions. | [optional][default to 0]
**presentation** | Option<**String**> | The text describing the item or the available possible answers. | [optional]
**required** | Option<**bool**> | Whether is a item (question) required or not. | [optional][default to 0]
**template** | Option<**i32**> | If it belogns to a template, the template id. | [optional][default to 0]
**typ** | Option<**String**> | The type of the item. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


