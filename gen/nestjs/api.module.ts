import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

import { AuthEmailService } from './@joshuapare/moodle-client-nestjs/auth-email.service';
import { BlockAccessreviewService } from './@joshuapare/moodle-client-nestjs/block-accessreview.service';
import { BlockIomadCompanyAdminService } from './@joshuapare/moodle-client-nestjs/block-iomad-company-admin.service';
import { BlockRecentlyaccesseditemsService } from './@joshuapare/moodle-client-nestjs/block-recentlyaccesseditems.service';
import { BlockStarredcoursesService } from './@joshuapare/moodle-client-nestjs/block-starredcourses.service';
import { EnrolGuestService } from './@joshuapare/moodle-client-nestjs/enrol-guest.service';
import { EnrolLicenseService } from './@joshuapare/moodle-client-nestjs/enrol-license.service';
import { EnrolManualService } from './@joshuapare/moodle-client-nestjs/enrol-manual.service';
import { EnrolMetaService } from './@joshuapare/moodle-client-nestjs/enrol-meta.service';
import { EnrolSelfService } from './@joshuapare/moodle-client-nestjs/enrol-self.service';
import { GradereportGraderService } from './@joshuapare/moodle-client-nestjs/gradereport-grader.service';
import { GradereportOverviewService } from './@joshuapare/moodle-client-nestjs/gradereport-overview.service';
import { GradereportSingleviewService } from './@joshuapare/moodle-client-nestjs/gradereport-singleview.service';
import { GradereportUserService } from './@joshuapare/moodle-client-nestjs/gradereport-user.service';
import { GradingformGuideService } from './@joshuapare/moodle-client-nestjs/gradingform-guide.service';
import { GradingformRubricService } from './@joshuapare/moodle-client-nestjs/gradingform-rubric.service';
import { LocalIomadLearningpathService } from './@joshuapare/moodle-client-nestjs/local-iomad-learningpath.service';
import { MediaVideojsService } from './@joshuapare/moodle-client-nestjs/media-videojs.service';
import { MessageAirnotifierService } from './@joshuapare/moodle-client-nestjs/message-airnotifier.service';
import { MessagePopupService } from './@joshuapare/moodle-client-nestjs/message-popup.service';
import { ModAssignService } from './@joshuapare/moodle-client-nestjs/mod-assign.service';
import { ModBigbluebuttonbnService } from './@joshuapare/moodle-client-nestjs/mod-bigbluebuttonbn.service';
import { ModBookService } from './@joshuapare/moodle-client-nestjs/mod-book.service';
import { ModChatService } from './@joshuapare/moodle-client-nestjs/mod-chat.service';
import { ModChoiceService } from './@joshuapare/moodle-client-nestjs/mod-choice.service';
import { ModDataService } from './@joshuapare/moodle-client-nestjs/mod-data.service';
import { ModFeedbackService } from './@joshuapare/moodle-client-nestjs/mod-feedback.service';
import { ModFolderService } from './@joshuapare/moodle-client-nestjs/mod-folder.service';
import { ModForumService } from './@joshuapare/moodle-client-nestjs/mod-forum.service';
import { ModGlossaryService } from './@joshuapare/moodle-client-nestjs/mod-glossary.service';
import { ModH5pactivityService } from './@joshuapare/moodle-client-nestjs/mod-h5pactivity.service';
import { ModImscpService } from './@joshuapare/moodle-client-nestjs/mod-imscp.service';
import { ModIomadcertificateService } from './@joshuapare/moodle-client-nestjs/mod-iomadcertificate.service';
import { ModLabelService } from './@joshuapare/moodle-client-nestjs/mod-label.service';
import { ModLessonService } from './@joshuapare/moodle-client-nestjs/mod-lesson.service';
import { ModLtiService } from './@joshuapare/moodle-client-nestjs/mod-lti.service';
import { ModPageService } from './@joshuapare/moodle-client-nestjs/mod-page.service';
import { ModQuizService } from './@joshuapare/moodle-client-nestjs/mod-quiz.service';
import { ModResourceService } from './@joshuapare/moodle-client-nestjs/mod-resource.service';
import { ModScormService } from './@joshuapare/moodle-client-nestjs/mod-scorm.service';
import { ModSurveyService } from './@joshuapare/moodle-client-nestjs/mod-survey.service';
import { ModUrlService } from './@joshuapare/moodle-client-nestjs/mod-url.service';
import { ModWikiService } from './@joshuapare/moodle-client-nestjs/mod-wiki.service';
import { ModWorkshopService } from './@joshuapare/moodle-client-nestjs/mod-workshop.service';
import { MoodleService } from './@joshuapare/moodle-client-nestjs/moodle.service';
import { PaygwPaypalService } from './@joshuapare/moodle-client-nestjs/paygw-paypal.service';
import { QbankColumnsortorderService } from './@joshuapare/moodle-client-nestjs/qbank-columnsortorder.service';
import { QbankEditquestionService } from './@joshuapare/moodle-client-nestjs/qbank-editquestion.service';
import { QbankTagquestionService } from './@joshuapare/moodle-client-nestjs/qbank-tagquestion.service';
import { QbankViewquestiontextService } from './@joshuapare/moodle-client-nestjs/qbank-viewquestiontext.service';
import { QuizaccessSebService } from './@joshuapare/moodle-client-nestjs/quizaccess-seb.service';
import { ReportCompetencyService } from './@joshuapare/moodle-client-nestjs/report-competency.service';
import { ReportInsightsService } from './@joshuapare/moodle-client-nestjs/report-insights.service';
import { TinyAutosaveService } from './@joshuapare/moodle-client-nestjs/tiny-autosave.service';
import { TinyEquationService } from './@joshuapare/moodle-client-nestjs/tiny-equation.service';
import { TinyPremiumService } from './@joshuapare/moodle-client-nestjs/tiny-premium.service';
import { ToolAnalyticsService } from './@joshuapare/moodle-client-nestjs/tool-analytics.service';
import { ToolBehatService } from './@joshuapare/moodle-client-nestjs/tool-behat.service';
import { ToolDataprivacyService } from './@joshuapare/moodle-client-nestjs/tool-dataprivacy.service';
import { ToolIomadpolicyService } from './@joshuapare/moodle-client-nestjs/tool-iomadpolicy.service';
import { ToolLpService } from './@joshuapare/moodle-client-nestjs/tool-lp.service';
import { ToolMobileService } from './@joshuapare/moodle-client-nestjs/tool-mobile.service';
import { ToolMoodlenetService } from './@joshuapare/moodle-client-nestjs/tool-moodlenet.service';
import { ToolPolicyService } from './@joshuapare/moodle-client-nestjs/tool-policy.service';
import { ToolTemplatelibraryService } from './@joshuapare/moodle-client-nestjs/tool-templatelibrary.service';
import { ToolUsertoursService } from './@joshuapare/moodle-client-nestjs/tool-usertours.service';
import { ToolXmldbService } from './@joshuapare/moodle-client-nestjs/tool-xmldb.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AuthEmailService,
    BlockAccessreviewService,
    BlockIomadCompanyAdminService,
    BlockRecentlyaccesseditemsService,
    BlockStarredcoursesService,
    EnrolGuestService,
    EnrolLicenseService,
    EnrolManualService,
    EnrolMetaService,
    EnrolSelfService,
    GradereportGraderService,
    GradereportOverviewService,
    GradereportSingleviewService,
    GradereportUserService,
    GradingformGuideService,
    GradingformRubricService,
    LocalIomadLearningpathService,
    MediaVideojsService,
    MessageAirnotifierService,
    MessagePopupService,
    ModAssignService,
    ModBigbluebuttonbnService,
    ModBookService,
    ModChatService,
    ModChoiceService,
    ModDataService,
    ModFeedbackService,
    ModFolderService,
    ModForumService,
    ModGlossaryService,
    ModH5pactivityService,
    ModImscpService,
    ModIomadcertificateService,
    ModLabelService,
    ModLessonService,
    ModLtiService,
    ModPageService,
    ModQuizService,
    ModResourceService,
    ModScormService,
    ModSurveyService,
    ModUrlService,
    ModWikiService,
    ModWorkshopService,
    MoodleService,
    PaygwPaypalService,
    QbankColumnsortorderService,
    QbankEditquestionService,
    QbankTagquestionService,
    QbankViewquestiontextService,
    QuizaccessSebService,
    ReportCompetencyService,
    ReportInsightsService,
    TinyAutosaveService,
    TinyEquationService,
    TinyPremiumService,
    ToolAnalyticsService,
    ToolBehatService,
    ToolDataprivacyService,
    ToolIomadpolicyService,
    ToolLpService,
    ToolMobileService,
    ToolMoodlenetService,
    ToolPolicyService,
    ToolTemplatelibraryService,
    ToolUsertoursService,
    ToolXmldbService
  ],
  providers: [
    AuthEmailService,
    BlockAccessreviewService,
    BlockIomadCompanyAdminService,
    BlockRecentlyaccesseditemsService,
    BlockStarredcoursesService,
    EnrolGuestService,
    EnrolLicenseService,
    EnrolManualService,
    EnrolMetaService,
    EnrolSelfService,
    GradereportGraderService,
    GradereportOverviewService,
    GradereportSingleviewService,
    GradereportUserService,
    GradingformGuideService,
    GradingformRubricService,
    LocalIomadLearningpathService,
    MediaVideojsService,
    MessageAirnotifierService,
    MessagePopupService,
    ModAssignService,
    ModBigbluebuttonbnService,
    ModBookService,
    ModChatService,
    ModChoiceService,
    ModDataService,
    ModFeedbackService,
    ModFolderService,
    ModForumService,
    ModGlossaryService,
    ModH5pactivityService,
    ModImscpService,
    ModIomadcertificateService,
    ModLabelService,
    ModLessonService,
    ModLtiService,
    ModPageService,
    ModQuizService,
    ModResourceService,
    ModScormService,
    ModSurveyService,
    ModUrlService,
    ModWikiService,
    ModWorkshopService,
    MoodleService,
    PaygwPaypalService,
    QbankColumnsortorderService,
    QbankEditquestionService,
    QbankTagquestionService,
    QbankViewquestiontextService,
    QuizaccessSebService,
    ReportCompetencyService,
    ReportInsightsService,
    TinyAutosaveService,
    TinyEquationService,
    TinyPremiumService,
    ToolAnalyticsService,
    ToolBehatService,
    ToolDataprivacyService,
    ToolIomadpolicyService,
    ToolLpService,
    ToolMobileService,
    ToolMoodlenetService,
    ToolPolicyService,
    ToolTemplatelibraryService,
    ToolUsertoursService,
    ToolXmldbService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    /**
     * Register the module asynchronously.
     */
    static forRootAsync(options: AsyncConfiguration): DynamicModule {
        const providers = [...this.createAsyncProviders(options)];
        return {
            module: ApiModule,
            imports: options.imports || [],
            providers,
            exports: providers,
        };
    }

    private static createAsyncProviders(options: AsyncConfiguration): Provider[] {
        if (options.useClass) {
            return [
                this.createAsyncConfigurationProvider(options),
                {
                    provide: options.useClass,
                    useClass: options.useClass,
                },
            ];
        }
        return [this.createAsyncConfigurationProvider(options)];
    }

    private static createAsyncConfigurationProvider(
        options: AsyncConfiguration,
    ): Provider {
        if (options.useFactory) {
            return {
                provide: Configuration,
                useFactory: options.useFactory,
                inject: options.inject || [],
            };
        }
        return {
            provide: Configuration,
            useFactory: async (optionsFactory: ConfigurationFactory) =>
                await optionsFactory.createConfiguration(),
            inject: (options.useExisting && [options.useExisting]) || (options.useClass && [options.useClass]) || [],
        };
    }

    constructor( httpService: HttpService) { }
}
