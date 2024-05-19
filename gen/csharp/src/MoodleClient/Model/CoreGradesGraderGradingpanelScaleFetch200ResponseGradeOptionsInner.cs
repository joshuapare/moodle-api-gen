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
    /// CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
    /// </summary>
    [DataContract(Name = "core_grades_grader_gradingpanel_scale_fetch_200_response_grade_options_inner")]
    public partial class CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner" /> class.
        /// </summary>
        /// <param name="selected">Whether this item is currently selected (default to null).</param>
        /// <param name="title">The description fo the option (default to &quot;null&quot;).</param>
        /// <param name="value">The grade value (default to nullM).</param>
        public CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner(bool selected = null, string title = @"null", decimal value = nullM)
        {
            this.Selected = selected;
            // use default value if no "title" provided
            this.Title = title ?? @"null";
            this.Value = value;
        }

        /// <summary>
        /// Whether this item is currently selected
        /// </summary>
        /// <value>Whether this item is currently selected</value>
        [DataMember(Name = "selected", EmitDefaultValue = true)]
        public bool Selected { get; set; }

        /// <summary>
        /// The description fo the option
        /// </summary>
        /// <value>The description fo the option</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// The grade value
        /// </summary>
        /// <value>The grade value</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public decimal Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {\n");
            sb.Append("  Selected: ").Append(Selected).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
