# QbankColumnsortorderSetColumnSizeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_global** | **bool** | Set global config setting, rather than user preference | [optional] [default to False]
**sizes** | **str** | Size for each column, as a JSON string representing [column &#x3D;&gt; size] | [optional] [default to 'null']

## Example

```python
from openapi_client.models.qbank_columnsortorder_set_column_size_request import QbankColumnsortorderSetColumnSizeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QbankColumnsortorderSetColumnSizeRequest from a JSON string
qbank_columnsortorder_set_column_size_request_instance = QbankColumnsortorderSetColumnSizeRequest.from_json(json)
# print the JSON string representation of the object
print(QbankColumnsortorderSetColumnSizeRequest.to_json())

# convert the object into a dict
qbank_columnsortorder_set_column_size_request_dict = qbank_columnsortorder_set_column_size_request_instance.to_dict()
# create an instance of QbankColumnsortorderSetColumnSizeRequest from a dict
qbank_columnsortorder_set_column_size_request_from_dict = QbankColumnsortorderSetColumnSizeRequest.from_dict(qbank_columnsortorder_set_column_size_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


