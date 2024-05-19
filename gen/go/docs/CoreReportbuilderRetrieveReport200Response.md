# CoreReportbuilderRetrieveReport200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**CoreReportbuilderRetrieveReport200ResponseData**](CoreReportbuilderRetrieveReport200ResponseData.md) |  | 
**Details** | [**CoreReportbuilderRetrieveReport200ResponseDetails**](CoreReportbuilderRetrieveReport200ResponseDetails.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreReportbuilderRetrieveReport200Response

`func NewCoreReportbuilderRetrieveReport200Response(data CoreReportbuilderRetrieveReport200ResponseData, details CoreReportbuilderRetrieveReport200ResponseDetails, ) *CoreReportbuilderRetrieveReport200Response`

NewCoreReportbuilderRetrieveReport200Response instantiates a new CoreReportbuilderRetrieveReport200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderRetrieveReport200ResponseWithDefaults

`func NewCoreReportbuilderRetrieveReport200ResponseWithDefaults() *CoreReportbuilderRetrieveReport200Response`

NewCoreReportbuilderRetrieveReport200ResponseWithDefaults instantiates a new CoreReportbuilderRetrieveReport200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *CoreReportbuilderRetrieveReport200Response) GetData() CoreReportbuilderRetrieveReport200ResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CoreReportbuilderRetrieveReport200Response) GetDataOk() (*CoreReportbuilderRetrieveReport200ResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CoreReportbuilderRetrieveReport200Response) SetData(v CoreReportbuilderRetrieveReport200ResponseData)`

SetData sets Data field to given value.


### GetDetails

`func (o *CoreReportbuilderRetrieveReport200Response) GetDetails() CoreReportbuilderRetrieveReport200ResponseDetails`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *CoreReportbuilderRetrieveReport200Response) GetDetailsOk() (*CoreReportbuilderRetrieveReport200ResponseDetails, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *CoreReportbuilderRetrieveReport200Response) SetDetails(v CoreReportbuilderRetrieveReport200ResponseDetails)`

SetDetails sets Details field to given value.


### GetWarnings

`func (o *CoreReportbuilderRetrieveReport200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreReportbuilderRetrieveReport200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreReportbuilderRetrieveReport200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreReportbuilderRetrieveReport200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


