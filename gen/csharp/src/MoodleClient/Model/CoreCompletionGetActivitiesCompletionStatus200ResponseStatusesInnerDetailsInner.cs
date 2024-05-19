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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
    /// </summary>
    [DataContract(Name = "core_completion_get_activities_completion_status_200_response_statuses_inner_details_inner")]
    public partial class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner" /> class.
        /// </summary>
        /// <param name="rulename">Rule name (default to &quot;null&quot;).</param>
        /// <param name="rulevalue">rulevalue.</param>
        public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner(string rulename = @"null", CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue rulevalue = default(CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue))
        {
            // use default value if no "rulename" provided
            this.Rulename = rulename ?? @"null";
            this.Rulevalue = rulevalue;
        }

        /// <summary>
        /// Rule name
        /// </summary>
        /// <value>Rule name</value>
        [DataMember(Name = "rulename", EmitDefaultValue = false)]
        public string Rulename { get; set; }

        /// <summary>
        /// Gets or Sets Rulevalue
        /// </summary>
        [DataMember(Name = "rulevalue", EmitDefaultValue = false)]
        public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue Rulevalue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {\n");
            sb.Append("  Rulename: ").Append(Rulename).Append("\n");
            sb.Append("  Rulevalue: ").Append(Rulevalue).Append("\n");
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