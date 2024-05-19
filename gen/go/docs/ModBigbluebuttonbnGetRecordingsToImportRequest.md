# ModBigbluebuttonbnGetRecordingsToImportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Destinationinstanceid** | **int32** | Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. | [default to null]
**Groupid** | Pointer to **int32** | Group ID | [optional] 
**Sourcebigbluebuttonbnid** | Pointer to **int32** | bigbluebuttonbn instance id | [optional] [default to 0]
**Sourcecourseid** | Pointer to **int32** | source courseid to filter by | [optional] [default to 0]
**Tools** | Pointer to **string** | a set of enabled tools | [optional] [default to "protect,unprotect,publish,unpublish,delete"]

## Methods

### NewModBigbluebuttonbnGetRecordingsToImportRequest

`func NewModBigbluebuttonbnGetRecordingsToImportRequest(destinationinstanceid int32, ) *ModBigbluebuttonbnGetRecordingsToImportRequest`

NewModBigbluebuttonbnGetRecordingsToImportRequest instantiates a new ModBigbluebuttonbnGetRecordingsToImportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnGetRecordingsToImportRequestWithDefaults

`func NewModBigbluebuttonbnGetRecordingsToImportRequestWithDefaults() *ModBigbluebuttonbnGetRecordingsToImportRequest`

NewModBigbluebuttonbnGetRecordingsToImportRequestWithDefaults instantiates a new ModBigbluebuttonbnGetRecordingsToImportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDestinationinstanceid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetDestinationinstanceid() int32`

GetDestinationinstanceid returns the Destinationinstanceid field if non-nil, zero value otherwise.

### GetDestinationinstanceidOk

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetDestinationinstanceidOk() (*int32, bool)`

GetDestinationinstanceidOk returns a tuple with the Destinationinstanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationinstanceid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) SetDestinationinstanceid(v int32)`

SetDestinationinstanceid sets Destinationinstanceid field to given value.


### GetGroupid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetSourcebigbluebuttonbnid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetSourcebigbluebuttonbnid() int32`

GetSourcebigbluebuttonbnid returns the Sourcebigbluebuttonbnid field if non-nil, zero value otherwise.

### GetSourcebigbluebuttonbnidOk

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetSourcebigbluebuttonbnidOk() (*int32, bool)`

GetSourcebigbluebuttonbnidOk returns a tuple with the Sourcebigbluebuttonbnid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourcebigbluebuttonbnid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) SetSourcebigbluebuttonbnid(v int32)`

SetSourcebigbluebuttonbnid sets Sourcebigbluebuttonbnid field to given value.

### HasSourcebigbluebuttonbnid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) HasSourcebigbluebuttonbnid() bool`

HasSourcebigbluebuttonbnid returns a boolean if a field has been set.

### GetSourcecourseid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetSourcecourseid() int32`

GetSourcecourseid returns the Sourcecourseid field if non-nil, zero value otherwise.

### GetSourcecourseidOk

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetSourcecourseidOk() (*int32, bool)`

GetSourcecourseidOk returns a tuple with the Sourcecourseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourcecourseid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) SetSourcecourseid(v int32)`

SetSourcecourseid sets Sourcecourseid field to given value.

### HasSourcecourseid

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) HasSourcecourseid() bool`

HasSourcecourseid returns a boolean if a field has been set.

### GetTools

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetTools() string`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) GetToolsOk() (*string, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) SetTools(v string)`

SetTools sets Tools field to given value.

### HasTools

`func (o *ModBigbluebuttonbnGetRecordingsToImportRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


