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
    /// GradingformGuideGraderGradingpanelStore200Response
    /// </summary>
    [DataContract(Name = "gradingform_guide_grader_gradingpanel_store_200_response")]
    public partial class GradingformGuideGraderGradingpanelStore200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GradingformGuideGraderGradingpanelStore200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GradingformGuideGraderGradingpanelStore200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GradingformGuideGraderGradingpanelStore200Response" /> class.
        /// </summary>
        /// <param name="grade">grade (required).</param>
        /// <param name="hasgrade">Does the user have a grade? (required).</param>
        /// <param name="templatename">The template to use when rendering this data (required).</param>
        /// <param name="warnings">warnings.</param>
        public GradingformGuideGraderGradingpanelStore200Response(GradingformGuideGraderGradingpanelStore200ResponseGrade grade = default(GradingformGuideGraderGradingpanelStore200ResponseGrade), bool hasgrade = default(bool), string templatename = default(string), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "grade" is required (not null)
            if (grade == null)
            {
                throw new ArgumentNullException("grade is a required property for GradingformGuideGraderGradingpanelStore200Response and cannot be null");
            }
            this.Grade = grade;
            this.Hasgrade = hasgrade;
            // to ensure "templatename" is required (not null)
            if (templatename == null)
            {
                throw new ArgumentNullException("templatename is a required property for GradingformGuideGraderGradingpanelStore200Response and cannot be null");
            }
            this.Templatename = templatename;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Grade
        /// </summary>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public GradingformGuideGraderGradingpanelStore200ResponseGrade Grade { get; set; }

        /// <summary>
        /// Does the user have a grade?
        /// </summary>
        /// <value>Does the user have a grade?</value>
        [DataMember(Name = "hasgrade", IsRequired = true, EmitDefaultValue = true)]
        public bool Hasgrade { get; set; }

        /// <summary>
        /// The template to use when rendering this data
        /// </summary>
        /// <value>The template to use when rendering this data</value>
        [DataMember(Name = "templatename", IsRequired = true, EmitDefaultValue = true)]
        public string Templatename { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GradingformGuideGraderGradingpanelStore200Response {\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Hasgrade: ").Append(Hasgrade).Append("\n");
            sb.Append("  Templatename: ").Append(Templatename).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
