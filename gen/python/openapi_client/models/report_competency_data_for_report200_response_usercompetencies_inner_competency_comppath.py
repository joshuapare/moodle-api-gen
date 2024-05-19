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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List
from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_competency_comppath_ancestors_inner import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner
from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_competency_comppath_framework import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
from typing import Optional, Set
from typing_extensions import Self

class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath(BaseModel):
    """
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
    """ # noqa: E501
    ancestors: List[ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner]
    framework: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
    pagecontextid: StrictInt = Field(description="pagecontextid")
    pluginbaseurl: StrictStr = Field(description="pluginbaseurl")
    showlinks: StrictBool = Field(description="showlinks")
    __properties: ClassVar[List[str]] = ["ancestors", "framework", "pagecontextid", "pluginbaseurl", "showlinks"]

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
        """Create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in ancestors (list)
        _items = []
        if self.ancestors:
            for _item in self.ancestors:
                if _item:
                    _items.append(_item.to_dict())
            _dict['ancestors'] = _items
        # override the default output from pydantic by calling `to_dict()` of framework
        if self.framework:
            _dict['framework'] = self.framework.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ancestors": [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner.from_dict(_item) for _item in obj["ancestors"]] if obj.get("ancestors") is not None else None,
            "framework": ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.from_dict(obj["framework"]) if obj.get("framework") is not None else None,
            "pagecontextid": obj.get("pagecontextid") if obj.get("pagecontextid") is not None else null,
            "pluginbaseurl": obj.get("pluginbaseurl") if obj.get("pluginbaseurl") is not None else 'null',
            "showlinks": obj.get("showlinks") if obj.get("showlinks") is not None else False
        })
        return _obj


