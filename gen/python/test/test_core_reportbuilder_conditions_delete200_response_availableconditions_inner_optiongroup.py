# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_reportbuilder_conditions_delete200_response_availableconditions_inner_optiongroup import CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup

class TestCoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup(unittest.TestCase):
    """CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup:
        """Test CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup`
        """
        model = CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup()
        if include_optional:
            return CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup(
                text = '',
                values = [
                    openapi_client.models.core_reportbuilder_conditions_delete_200_response_availableconditions_inner_optiongroup_values_inner.core_reportbuilder_conditions_delete_200_response_availableconditions_inner_optiongroup_values_inner(
                        value = '', 
                        visiblename = '', )
                    ]
            )
        else:
            return CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup(
                text = '',
                values = [
                    openapi_client.models.core_reportbuilder_conditions_delete_200_response_availableconditions_inner_optiongroup_values_inner.core_reportbuilder_conditions_delete_200_response_availableconditions_inner_optiongroup_values_inner(
                        value = '', 
                        visiblename = '', )
                    ],
        )
        """

    def testCoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup(self):
        """Test CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
