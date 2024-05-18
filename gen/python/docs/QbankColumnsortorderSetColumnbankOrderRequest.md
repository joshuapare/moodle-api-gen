# QbankColumnsortorderSetColumnbankOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List[object]** |  | [optional] 
**var_global** | **bool** | Set global config setting, rather than user preference | [optional] [default to False]

## Example

```python
from openapi_client.models.qbank_columnsortorder_set_columnbank_order_request import QbankColumnsortorderSetColumnbankOrderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QbankColumnsortorderSetColumnbankOrderRequest from a JSON string
qbank_columnsortorder_set_columnbank_order_request_instance = QbankColumnsortorderSetColumnbankOrderRequest.from_json(json)
# print the JSON string representation of the object
print(QbankColumnsortorderSetColumnbankOrderRequest.to_json())

# convert the object into a dict
qbank_columnsortorder_set_columnbank_order_request_dict = qbank_columnsortorder_set_columnbank_order_request_instance.to_dict()
# create an instance of QbankColumnsortorderSetColumnbankOrderRequest from a dict
qbank_columnsortorder_set_columnbank_order_request_from_dict = QbankColumnsortorderSetColumnbankOrderRequest.from_dict(qbank_columnsortorder_set_columnbank_order_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


