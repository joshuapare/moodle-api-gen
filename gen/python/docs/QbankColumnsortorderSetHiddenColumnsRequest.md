# QbankColumnsortorderSetHiddenColumnsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List[object]** |  | [optional] 
**var_global** | **bool** | Set global config setting, rather than user preference | [optional] [default to False]

## Example

```python
from openapi_client.models.qbank_columnsortorder_set_hidden_columns_request import QbankColumnsortorderSetHiddenColumnsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QbankColumnsortorderSetHiddenColumnsRequest from a JSON string
qbank_columnsortorder_set_hidden_columns_request_instance = QbankColumnsortorderSetHiddenColumnsRequest.from_json(json)
# print the JSON string representation of the object
print(QbankColumnsortorderSetHiddenColumnsRequest.to_json())

# convert the object into a dict
qbank_columnsortorder_set_hidden_columns_request_dict = qbank_columnsortorder_set_hidden_columns_request_instance.to_dict()
# create an instance of QbankColumnsortorderSetHiddenColumnsRequest from a dict
qbank_columnsortorder_set_hidden_columns_request_from_dict = QbankColumnsortorderSetHiddenColumnsRequest.from_dict(qbank_columnsortorder_set_hidden_columns_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


