# CoreReportbuilderRetrieveSystemReport200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**CoreReportbuilderRetrieveSystemReport200ResponseData**](CoreReportbuilderRetrieveSystemReport200ResponseData.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreReportbuilderRetrieveSystemReport200Response

`func NewCoreReportbuilderRetrieveSystemReport200Response(data CoreReportbuilderRetrieveSystemReport200ResponseData, ) *CoreReportbuilderRetrieveSystemReport200Response`

NewCoreReportbuilderRetrieveSystemReport200Response instantiates a new CoreReportbuilderRetrieveSystemReport200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderRetrieveSystemReport200ResponseWithDefaults

`func NewCoreReportbuilderRetrieveSystemReport200ResponseWithDefaults() *CoreReportbuilderRetrieveSystemReport200Response`

NewCoreReportbuilderRetrieveSystemReport200ResponseWithDefaults instantiates a new CoreReportbuilderRetrieveSystemReport200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *CoreReportbuilderRetrieveSystemReport200Response) GetData() CoreReportbuilderRetrieveSystemReport200ResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CoreReportbuilderRetrieveSystemReport200Response) GetDataOk() (*CoreReportbuilderRetrieveSystemReport200ResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CoreReportbuilderRetrieveSystemReport200Response) SetData(v CoreReportbuilderRetrieveSystemReport200ResponseData)`

SetData sets Data field to given value.


### GetWarnings

`func (o *CoreReportbuilderRetrieveSystemReport200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreReportbuilderRetrieveSystemReport200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreReportbuilderRetrieveSystemReport200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreReportbuilderRetrieveSystemReport200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


