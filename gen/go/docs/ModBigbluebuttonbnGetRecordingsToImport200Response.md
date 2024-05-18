# ModBigbluebuttonbnGetRecordingsToImport200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** | Whether the fetch was successful | 
**Tabledata** | Pointer to [**ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata**](ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModBigbluebuttonbnGetRecordingsToImport200Response

`func NewModBigbluebuttonbnGetRecordingsToImport200Response(status bool, ) *ModBigbluebuttonbnGetRecordingsToImport200Response`

NewModBigbluebuttonbnGetRecordingsToImport200Response instantiates a new ModBigbluebuttonbnGetRecordingsToImport200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnGetRecordingsToImport200ResponseWithDefaults

`func NewModBigbluebuttonbnGetRecordingsToImport200ResponseWithDefaults() *ModBigbluebuttonbnGetRecordingsToImport200Response`

NewModBigbluebuttonbnGetRecordingsToImport200ResponseWithDefaults instantiates a new ModBigbluebuttonbnGetRecordingsToImport200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetTabledata

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetTabledata() ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata`

GetTabledata returns the Tabledata field if non-nil, zero value otherwise.

### GetTabledataOk

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetTabledataOk() (*ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata, bool)`

GetTabledataOk returns a tuple with the Tabledata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTabledata

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) SetTabledata(v ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata)`

SetTabledata sets Tabledata field to given value.

### HasTabledata

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) HasTabledata() bool`

HasTabledata returns a boolean if a field has been set.

### GetWarnings

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModBigbluebuttonbnGetRecordingsToImport200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


