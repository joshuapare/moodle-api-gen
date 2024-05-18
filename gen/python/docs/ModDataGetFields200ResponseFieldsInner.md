# ModDataGetFields200ResponseFieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataid** | **int** | The field type of the content. | [optional] [default to 0]
**description** | **str** | The field description. | [optional] [default to 'null']
**id** | **int** | Field id. | [optional] [default to null]
**name** | **str** | The field name. | [optional] [default to 'null']
**param1** | **str** | Field parameters | [optional] [default to 'null']
**param2** | **str** | Field parameters | [optional] 
**param3** | **str** | Field parameters | [optional] 
**param4** | **str** | Field parameters | [optional] 
**param5** | **str** | Field parameters | [optional] 
**param6** | **str** | Field parameters | [optional] 
**param7** | **str** | Field parameters | [optional] 
**param8** | **str** | Field parameters | [optional] 
**param9** | **str** | Field parameters | [optional] 
**param10** | **str** | Field parameters | [optional] 
**required** | **bool** | Whether is a field required or not. | [optional] [default to False]
**type** | **str** | The field type. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_data_get_fields200_response_fields_inner import ModDataGetFields200ResponseFieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetFields200ResponseFieldsInner from a JSON string
mod_data_get_fields200_response_fields_inner_instance = ModDataGetFields200ResponseFieldsInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetFields200ResponseFieldsInner.to_json())

# convert the object into a dict
mod_data_get_fields200_response_fields_inner_dict = mod_data_get_fields200_response_fields_inner_instance.to_dict()
# create an instance of ModDataGetFields200ResponseFieldsInner from a dict
mod_data_get_fields200_response_fields_inner_from_dict = ModDataGetFields200ResponseFieldsInner.from_dict(mod_data_get_fields200_response_fields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


