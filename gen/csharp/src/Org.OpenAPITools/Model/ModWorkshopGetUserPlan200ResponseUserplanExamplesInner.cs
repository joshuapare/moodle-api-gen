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
    /// ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
    /// </summary>
    [DataContract(Name = "mod_workshop_get_user_plan_200_response_userplan_examples_inner")]
    public partial class ModWorkshopGetUserPlan200ResponseUserplanExamplesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetUserPlan200ResponseUserplanExamplesInner" /> class.
        /// </summary>
        /// <param name="assessmentid">Example submission assessment id. (default to null).</param>
        /// <param name="grade">The submission grade. (default to nullM).</param>
        /// <param name="gradinggrade">The assessment grade. (default to nullM).</param>
        /// <param name="id">Example submission id. (default to null).</param>
        /// <param name="title">Example submission title. (default to &quot;null&quot;).</param>
        public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner(int assessmentid = null, decimal grade = nullM, decimal gradinggrade = nullM, int id = null, string title = @"null")
        {
            this.Assessmentid = assessmentid;
            this.Grade = grade;
            this.Gradinggrade = gradinggrade;
            this.Id = id;
            // use default value if no "title" provided
            this.Title = title ?? @"null";
        }

        /// <summary>
        /// Example submission assessment id.
        /// </summary>
        /// <value>Example submission assessment id.</value>
        [DataMember(Name = "assessmentid", EmitDefaultValue = false)]
        public int Assessmentid { get; set; }

        /// <summary>
        /// The submission grade.
        /// </summary>
        /// <value>The submission grade.</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public decimal Grade { get; set; }

        /// <summary>
        /// The assessment grade.
        /// </summary>
        /// <value>The assessment grade.</value>
        [DataMember(Name = "gradinggrade", EmitDefaultValue = false)]
        public decimal Gradinggrade { get; set; }

        /// <summary>
        /// Example submission id.
        /// </summary>
        /// <value>Example submission id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Example submission title.
        /// </summary>
        /// <value>Example submission title.</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetUserPlan200ResponseUserplanExamplesInner {\n");
            sb.Append("  Assessmentid: ").Append(Assessmentid).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradinggrade: ").Append(Gradinggrade).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
