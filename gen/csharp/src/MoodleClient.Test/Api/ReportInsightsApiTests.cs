/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using MoodleClient.Client;
using MoodleClient.Api;
// uncomment below to import models
//using MoodleClient.Model;

namespace MoodleClient.Test.Api
{
    /// <summary>
    ///  Class for testing ReportInsightsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ReportInsightsApiTests : IDisposable
    {
        private ReportInsightsApi instance;

        public ReportInsightsApiTests()
        {
            instance = new ReportInsightsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ReportInsightsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ReportInsightsApi
            //Assert.IsType<ReportInsightsApi>(instance);
        }

        /// <summary>
        /// Test ReportInsightsActionExecuted
        /// </summary>
        [Fact]
        public void ReportInsightsActionExecutedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ReportInsightsActionExecutedRequest reportInsightsActionExecutedRequest = null;
            //var response = instance.ReportInsightsActionExecuted(reportInsightsActionExecutedRequest);
            //Assert.IsType<CoreCohortAddCohortMembers200Response>(response);
        }

        /// <summary>
        /// Test ReportInsightsSetFixedPrediction
        /// </summary>
        [Fact]
        public void ReportInsightsSetFixedPredictionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ReportInsightsSetFixedPredictionRequest reportInsightsSetFixedPredictionRequest = null;
            //var response = instance.ReportInsightsSetFixedPrediction(reportInsightsSetFixedPredictionRequest);
            //Assert.IsType<ReportInsightsSetFixedPrediction200Response>(response);
        }

        /// <summary>
        /// Test ReportInsightsSetNotusefulPrediction
        /// </summary>
        [Fact]
        public void ReportInsightsSetNotusefulPredictionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ReportInsightsSetNotusefulPredictionRequest reportInsightsSetNotusefulPredictionRequest = null;
            //var response = instance.ReportInsightsSetNotusefulPrediction(reportInsightsSetNotusefulPredictionRequest);
            //Assert.IsType<ReportInsightsSetNotusefulPrediction200Response>(response);
        }
    }
}