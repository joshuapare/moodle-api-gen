# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_competency_comppath_framework import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework

class TestReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework(unittest.TestCase):
    """ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework:
        """Test ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework`
        """
        model = ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework()
        if include_optional:
            return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework(
                first = True,
                id = 56,
                last = True,
                name = '',
                position = 56
            )
        else:
            return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework(
                first = True,
                id = 56,
                last = True,
                name = '',
                position = 56,
        )
        """

    def testReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework(self):
        """Test ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
