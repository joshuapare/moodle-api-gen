/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ReportInsightsActionExecutedRequest
    /// </summary>
    [DataContract(Name = "report_insights_action_executed_request")]
    public partial class ReportInsightsActionExecutedRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportInsightsActionExecutedRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReportInsightsActionExecutedRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportInsightsActionExecutedRequest" /> class.
        /// </summary>
        /// <param name="actionname">The name of the action (required) (default to &quot;null&quot;).</param>
        /// <param name="predictionids">predictionids (required).</param>
        public ReportInsightsActionExecutedRequest(string actionname = @"null", List<Object> predictionids = default(List<Object>))
        {
            // to ensure "actionname" is required (not null)
            if (actionname == null)
            {
                throw new ArgumentNullException("actionname is a required property for ReportInsightsActionExecutedRequest and cannot be null");
            }
            this.Actionname = actionname;
            // to ensure "predictionids" is required (not null)
            if (predictionids == null)
            {
                throw new ArgumentNullException("predictionids is a required property for ReportInsightsActionExecutedRequest and cannot be null");
            }
            this.Predictionids = predictionids;
        }

        /// <summary>
        /// The name of the action
        /// </summary>
        /// <value>The name of the action</value>
        [DataMember(Name = "actionname", IsRequired = true, EmitDefaultValue = true)]
        public string Actionname { get; set; }

        /// <summary>
        /// Gets or Sets Predictionids
        /// </summary>
        [DataMember(Name = "predictionids", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Predictionids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportInsightsActionExecutedRequest {\n");
            sb.Append("  Actionname: ").Append(Actionname).Append("\n");
            sb.Append("  Predictionids: ").Append(Predictionids).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
