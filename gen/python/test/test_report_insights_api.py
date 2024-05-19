# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.report_insights_api import ReportInsightsApi


class TestReportInsightsApi(unittest.TestCase):
    """ReportInsightsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ReportInsightsApi()

    def tearDown(self) -> None:
        pass

    def test_report_insights_action_executed(self) -> None:
        """Test case for report_insights_action_executed

        Stores an action executed over a group of predictions.
        """
        pass

    def test_report_insights_set_fixed_prediction(self) -> None:
        """Test case for report_insights_set_fixed_prediction

        Flags a prediction as fixed.
        """
        pass

    def test_report_insights_set_notuseful_prediction(self) -> None:
        """Test case for report_insights_set_notuseful_prediction

        Flags the prediction as not useful.
        """
        pass


if __name__ == '__main__':
    unittest.main()
