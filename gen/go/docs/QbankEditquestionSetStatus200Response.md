# QbankEditquestionSetStatus200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | **string** | Error message if error exists | [default to "null"]
**Status** | **bool** | status: true if success | 
**Statusname** | **string** | statusname: name of the status | [default to "null"]

## Methods

### NewQbankEditquestionSetStatus200Response

`func NewQbankEditquestionSetStatus200Response(error_ string, status bool, statusname string, ) *QbankEditquestionSetStatus200Response`

NewQbankEditquestionSetStatus200Response instantiates a new QbankEditquestionSetStatus200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQbankEditquestionSetStatus200ResponseWithDefaults

`func NewQbankEditquestionSetStatus200ResponseWithDefaults() *QbankEditquestionSetStatus200Response`

NewQbankEditquestionSetStatus200ResponseWithDefaults instantiates a new QbankEditquestionSetStatus200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetError

`func (o *QbankEditquestionSetStatus200Response) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *QbankEditquestionSetStatus200Response) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *QbankEditquestionSetStatus200Response) SetError(v string)`

SetError sets Error field to given value.


### GetStatus

`func (o *QbankEditquestionSetStatus200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *QbankEditquestionSetStatus200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *QbankEditquestionSetStatus200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetStatusname

`func (o *QbankEditquestionSetStatus200Response) GetStatusname() string`

GetStatusname returns the Statusname field if non-nil, zero value otherwise.

### GetStatusnameOk

`func (o *QbankEditquestionSetStatus200Response) GetStatusnameOk() (*string, bool)`

GetStatusnameOk returns a tuple with the Statusname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusname

`func (o *QbankEditquestionSetStatus200Response) SetStatusname(v string)`

SetStatusname sets Statusname field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


