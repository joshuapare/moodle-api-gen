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
    /// ModAssignSaveGradesRequestGradesInner
    /// </summary>
    [DataContract(Name = "mod_assign_save_grades_request_grades_inner")]
    public partial class ModAssignSaveGradesRequestGradesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSaveGradesRequestGradesInner" /> class.
        /// </summary>
        /// <param name="addattempt">Allow another attempt if manual attempt reopen method (default to null).</param>
        /// <param name="advancedgradingdata">advancedgradingdata.</param>
        /// <param name="attemptnumber">The attempt number (-1 means latest attempt).</param>
        /// <param name="grade">The new grade for this user. Ignored if advanced grading used.</param>
        /// <param name="plugindata">plugindata.</param>
        /// <param name="userid">The student id to operate on.</param>
        /// <param name="workflowstate">The next marking workflow state.</param>
        public ModAssignSaveGradesRequestGradesInner(bool addattempt = null, ModAssignSaveGradeRequestAdvancedgradingdata advancedgradingdata = default(ModAssignSaveGradeRequestAdvancedgradingdata), int attemptnumber = default(int), decimal grade = default(decimal), ModAssignSaveGradesRequestGradesInnerPlugindata plugindata = default(ModAssignSaveGradesRequestGradesInnerPlugindata), int userid = default(int), string workflowstate = default(string))
        {
            this.Addattempt = addattempt;
            this.Advancedgradingdata = advancedgradingdata;
            this.Attemptnumber = attemptnumber;
            this.Grade = grade;
            this.Plugindata = plugindata;
            this.Userid = userid;
            this.Workflowstate = workflowstate;
        }

        /// <summary>
        /// Allow another attempt if manual attempt reopen method
        /// </summary>
        /// <value>Allow another attempt if manual attempt reopen method</value>
        [DataMember(Name = "addattempt", EmitDefaultValue = true)]
        public bool Addattempt { get; set; }

        /// <summary>
        /// Gets or Sets Advancedgradingdata
        /// </summary>
        [DataMember(Name = "advancedgradingdata", EmitDefaultValue = false)]
        public ModAssignSaveGradeRequestAdvancedgradingdata Advancedgradingdata { get; set; }

        /// <summary>
        /// The attempt number (-1 means latest attempt)
        /// </summary>
        /// <value>The attempt number (-1 means latest attempt)</value>
        [DataMember(Name = "attemptnumber", EmitDefaultValue = false)]
        public int Attemptnumber { get; set; }

        /// <summary>
        /// The new grade for this user. Ignored if advanced grading used
        /// </summary>
        /// <value>The new grade for this user. Ignored if advanced grading used</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public decimal Grade { get; set; }

        /// <summary>
        /// Gets or Sets Plugindata
        /// </summary>
        [DataMember(Name = "plugindata", EmitDefaultValue = false)]
        public ModAssignSaveGradesRequestGradesInnerPlugindata Plugindata { get; set; }

        /// <summary>
        /// The student id to operate on
        /// </summary>
        /// <value>The student id to operate on</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// The next marking workflow state
        /// </summary>
        /// <value>The next marking workflow state</value>
        [DataMember(Name = "workflowstate", EmitDefaultValue = false)]
        public string Workflowstate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignSaveGradesRequestGradesInner {\n");
            sb.Append("  Addattempt: ").Append(Addattempt).Append("\n");
            sb.Append("  Advancedgradingdata: ").Append(Advancedgradingdata).Append("\n");
            sb.Append("  Attemptnumber: ").Append(Attemptnumber).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Plugindata: ").Append(Plugindata).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Workflowstate: ").Append(Workflowstate).Append("\n");
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