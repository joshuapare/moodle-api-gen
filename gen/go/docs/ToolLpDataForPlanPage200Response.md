# ToolLpDataForPlanPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencies** | [**[]ToolLpDataForPlanPage200ResponseCompetenciesInner**](ToolLpDataForPlanPage200ResponseCompetenciesInner.md) |  | 
**Competencycount** | **int32** | Count of competencies | [default to null]
**Contextid** | **int32** | Context ID. | [default to null]
**Plan** | [**CoreCompetencyReadPlan200Response**](CoreCompetencyReadPlan200Response.md) |  | 
**Pluginbaseurl** | **string** | Plugin base URL. | [default to "null"]
**Proficientcompetencycount** | **int32** | Count of proficientcompetencies | [default to null]
**Proficientcompetencypercentage** | **float32** | Percentage of competencies proficient | [default to null]
**Proficientcompetencypercentageformatted** | **string** | Displayable percentage | [default to "null"]

## Methods

### NewToolLpDataForPlanPage200Response

`func NewToolLpDataForPlanPage200Response(competencies []ToolLpDataForPlanPage200ResponseCompetenciesInner, competencycount int32, contextid int32, plan CoreCompetencyReadPlan200Response, pluginbaseurl string, proficientcompetencycount int32, proficientcompetencypercentage float32, proficientcompetencypercentageformatted string, ) *ToolLpDataForPlanPage200Response`

NewToolLpDataForPlanPage200Response instantiates a new ToolLpDataForPlanPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForPlanPage200ResponseWithDefaults

`func NewToolLpDataForPlanPage200ResponseWithDefaults() *ToolLpDataForPlanPage200Response`

NewToolLpDataForPlanPage200ResponseWithDefaults instantiates a new ToolLpDataForPlanPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencies

`func (o *ToolLpDataForPlanPage200Response) GetCompetencies() []ToolLpDataForPlanPage200ResponseCompetenciesInner`

GetCompetencies returns the Competencies field if non-nil, zero value otherwise.

### GetCompetenciesOk

`func (o *ToolLpDataForPlanPage200Response) GetCompetenciesOk() (*[]ToolLpDataForPlanPage200ResponseCompetenciesInner, bool)`

GetCompetenciesOk returns a tuple with the Competencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencies

`func (o *ToolLpDataForPlanPage200Response) SetCompetencies(v []ToolLpDataForPlanPage200ResponseCompetenciesInner)`

SetCompetencies sets Competencies field to given value.


### GetCompetencycount

`func (o *ToolLpDataForPlanPage200Response) GetCompetencycount() int32`

GetCompetencycount returns the Competencycount field if non-nil, zero value otherwise.

### GetCompetencycountOk

`func (o *ToolLpDataForPlanPage200Response) GetCompetencycountOk() (*int32, bool)`

GetCompetencycountOk returns a tuple with the Competencycount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencycount

`func (o *ToolLpDataForPlanPage200Response) SetCompetencycount(v int32)`

SetCompetencycount sets Competencycount field to given value.


### GetContextid

`func (o *ToolLpDataForPlanPage200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *ToolLpDataForPlanPage200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *ToolLpDataForPlanPage200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetPlan

`func (o *ToolLpDataForPlanPage200Response) GetPlan() CoreCompetencyReadPlan200Response`

GetPlan returns the Plan field if non-nil, zero value otherwise.

### GetPlanOk

`func (o *ToolLpDataForPlanPage200Response) GetPlanOk() (*CoreCompetencyReadPlan200Response, bool)`

GetPlanOk returns a tuple with the Plan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlan

`func (o *ToolLpDataForPlanPage200Response) SetPlan(v CoreCompetencyReadPlan200Response)`

SetPlan sets Plan field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForPlanPage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForPlanPage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForPlanPage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetProficientcompetencycount

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencycount() int32`

GetProficientcompetencycount returns the Proficientcompetencycount field if non-nil, zero value otherwise.

### GetProficientcompetencycountOk

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencycountOk() (*int32, bool)`

GetProficientcompetencycountOk returns a tuple with the Proficientcompetencycount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProficientcompetencycount

`func (o *ToolLpDataForPlanPage200Response) SetProficientcompetencycount(v int32)`

SetProficientcompetencycount sets Proficientcompetencycount field to given value.


### GetProficientcompetencypercentage

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencypercentage() float32`

GetProficientcompetencypercentage returns the Proficientcompetencypercentage field if non-nil, zero value otherwise.

### GetProficientcompetencypercentageOk

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencypercentageOk() (*float32, bool)`

GetProficientcompetencypercentageOk returns a tuple with the Proficientcompetencypercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProficientcompetencypercentage

`func (o *ToolLpDataForPlanPage200Response) SetProficientcompetencypercentage(v float32)`

SetProficientcompetencypercentage sets Proficientcompetencypercentage field to given value.


### GetProficientcompetencypercentageformatted

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencypercentageformatted() string`

GetProficientcompetencypercentageformatted returns the Proficientcompetencypercentageformatted field if non-nil, zero value otherwise.

### GetProficientcompetencypercentageformattedOk

`func (o *ToolLpDataForPlanPage200Response) GetProficientcompetencypercentageformattedOk() (*string, bool)`

GetProficientcompetencypercentageformattedOk returns a tuple with the Proficientcompetencypercentageformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProficientcompetencypercentageformatted

`func (o *ToolLpDataForPlanPage200Response) SetProficientcompetencypercentageformatted(v string)`

SetProficientcompetencypercentageformatted sets Proficientcompetencypercentageformatted field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


