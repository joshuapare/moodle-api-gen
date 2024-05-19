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
    /// ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner")]
    public partial class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner" /> class.
        /// </summary>
        /// <param name="contenthash">Sha1 hash of file content. (default to &quot;null&quot;).</param>
        /// <param name="context">context (default to null).</param>
        /// <param name="course">Course id this h5p activity is part of. (default to null).</param>
        /// <param name="coursemodule">coursemodule.</param>
        /// <param name="deployedfile">deployedfile.</param>
        /// <param name="displayoptions">H5P Button display options. (default to 0).</param>
        /// <param name="enabletracking">Enable xAPI tracking. (default to 1).</param>
        /// <param name="grade">The maximum grade for submission. (default to 0).</param>
        /// <param name="grademethod">Which H5P attempt is used for grading. (default to 1).</param>
        /// <param name="id">The primary key of the record..</param>
        /// <param name="intro">H5P activity description. (default to &quot;&quot;).</param>
        /// <param name="introfiles">introfiles.</param>
        /// <param name="introformat">intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 0).</param>
        /// <param name="name">The name of the activity module instance. (default to &quot;null&quot;).</param>
        /// <param name="package">package.</param>
        /// <param name="timecreated">Timestamp of when the instance was added to the course. (default to null).</param>
        /// <param name="timemodified">Timestamp of when the instance was last modified. (default to null).</param>
        public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner(string contenthash = @"null", int context = null, int course = null, int coursemodule = default(int), ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile deployedfile = default(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile), int displayoptions = 0, int enabletracking = 1, int grade = 0, int grademethod = 1, int id = default(int), string intro = @"", List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), int introformat = 0, string name = @"null", List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> package = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), int timecreated = null, int timemodified = null)
        {
            // use default value if no "contenthash" provided
            this.Contenthash = contenthash ?? @"null";
            this.Context = context;
            this.Course = course;
            this.Coursemodule = coursemodule;
            this.Deployedfile = deployedfile;
            this.Displayoptions = displayoptions;
            this.Enabletracking = enabletracking;
            this.Grade = grade;
            this.Grademethod = grademethod;
            this.Id = id;
            // use default value if no "intro" provided
            this.Intro = intro ?? @"";
            this.Introfiles = introfiles;
            this.Introformat = introformat;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Package = package;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
        }

        /// <summary>
        /// Sha1 hash of file content.
        /// </summary>
        /// <value>Sha1 hash of file content.</value>
        [DataMember(Name = "contenthash", EmitDefaultValue = false)]
        public string Contenthash { get; set; }

        /// <summary>
        /// context
        /// </summary>
        /// <value>context</value>
        [DataMember(Name = "context", EmitDefaultValue = false)]
        public int Context { get; set; }

        /// <summary>
        /// Course id this h5p activity is part of.
        /// </summary>
        /// <value>Course id this h5p activity is part of.</value>
        [DataMember(Name = "course", EmitDefaultValue = false)]
        public int Course { get; set; }

        /// <summary>
        /// coursemodule
        /// </summary>
        /// <value>coursemodule</value>
        [DataMember(Name = "coursemodule", EmitDefaultValue = false)]
        public int Coursemodule { get; set; }

        /// <summary>
        /// Gets or Sets Deployedfile
        /// </summary>
        [DataMember(Name = "deployedfile", EmitDefaultValue = false)]
        public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile Deployedfile { get; set; }

        /// <summary>
        /// H5P Button display options.
        /// </summary>
        /// <value>H5P Button display options.</value>
        [DataMember(Name = "displayoptions", EmitDefaultValue = false)]
        public int Displayoptions { get; set; }

        /// <summary>
        /// Enable xAPI tracking.
        /// </summary>
        /// <value>Enable xAPI tracking.</value>
        [DataMember(Name = "enabletracking", EmitDefaultValue = false)]
        public int Enabletracking { get; set; }

        /// <summary>
        /// The maximum grade for submission.
        /// </summary>
        /// <value>The maximum grade for submission.</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public int Grade { get; set; }

        /// <summary>
        /// Which H5P attempt is used for grading.
        /// </summary>
        /// <value>Which H5P attempt is used for grading.</value>
        [DataMember(Name = "grademethod", EmitDefaultValue = false)]
        public int Grademethod { get; set; }

        /// <summary>
        /// The primary key of the record.
        /// </summary>
        /// <value>The primary key of the record.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// H5P activity description.
        /// </summary>
        /// <value>H5P activity description.</value>
        [DataMember(Name = "intro", EmitDefaultValue = false)]
        public string Intro { get; set; }

        /// <summary>
        /// Gets or Sets Introfiles
        /// </summary>
        [DataMember(Name = "introfiles", EmitDefaultValue = false)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Introfiles { get; set; }

        /// <summary>
        /// intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "introformat", EmitDefaultValue = false)]
        public int Introformat { get; set; }

        /// <summary>
        /// The name of the activity module instance.
        /// </summary>
        /// <value>The name of the activity module instance.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Package
        /// </summary>
        [DataMember(Name = "package", EmitDefaultValue = false)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Package { get; set; }

        /// <summary>
        /// Timestamp of when the instance was added to the course.
        /// </summary>
        /// <value>Timestamp of when the instance was added to the course.</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Timestamp of when the instance was last modified.
        /// </summary>
        /// <value>Timestamp of when the instance was last modified.</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {\n");
            sb.Append("  Contenthash: ").Append(Contenthash).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Coursemodule: ").Append(Coursemodule).Append("\n");
            sb.Append("  Deployedfile: ").Append(Deployedfile).Append("\n");
            sb.Append("  Displayoptions: ").Append(Displayoptions).Append("\n");
            sb.Append("  Enabletracking: ").Append(Enabletracking).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Grademethod: ").Append(Grademethod).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Intro: ").Append(Intro).Append("\n");
            sb.Append("  Introfiles: ").Append(Introfiles).Append("\n");
            sb.Append("  Introformat: ").Append(Introformat).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Package: ").Append(Package).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
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