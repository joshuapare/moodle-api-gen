# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner(BaseModel):
    """
    GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
    """ # noqa: E501
    description: Optional[StrictStr] = Field(default='null', description="The description of the criterion")
    descriptionmarkers: Optional[StrictStr] = Field(default='null', description="The description of the criterion for markers")
    id: Optional[StrictInt] = Field(default=null, description="The id of the criterion")
    maxscore: Optional[Union[StrictFloat, StrictInt]] = Field(default=null, description="The maximum score for this criterion")
    name: Optional[StrictStr] = Field(default='null', description="The name of the criterion")
    remark: Optional[StrictStr] = Field(default='null', description="Any remarks for this criterion for the user being assessed")
    score: Optional[Union[StrictFloat, StrictInt]] = Field(default=null, description="The current score for user being assessed")
    __properties: ClassVar[List[str]] = ["description", "descriptionmarkers", "id", "maxscore", "name", "remark", "score"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description") if obj.get("description") is not None else 'null',
            "descriptionmarkers": obj.get("descriptionmarkers") if obj.get("descriptionmarkers") is not None else 'null',
            "id": obj.get("id") if obj.get("id") is not None else null,
            "maxscore": obj.get("maxscore") if obj.get("maxscore") is not None else null,
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "remark": obj.get("remark") if obj.get("remark") is not None else 'null',
            "score": obj.get("score") if obj.get("score") is not None else null
        })
        return _obj


